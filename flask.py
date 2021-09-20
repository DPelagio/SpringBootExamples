import time
from json import dumps

from flask import Flask, Response, request
from kafka import KafkaProducer

ENCODE_UTF_8 = 'utf-8'
kafkaBroker = "localhost:9092"
locationTopic = "location"

producer = KafkaProducer(bootstrap_servers=[kafkaBroker],
                         value_serializer=lambda x:
                         dumps(x).encode(ENCODE_UTF_8))

app = Flask(__name__)


@app.route('/data-simulator', methods=['POST'])
def simulateData():
    data = request.get_json(force=True)
    supi = data["supi"]
    repetitionPeriod = int(data["repetitionPeriod"])
    duration = int(data["duration"])
    startTime = time.time()
    mobilitySimulation(supi, duration, repetitionPeriod, startTime)
    return Response(mimetype='application/json', status=202)


def mobilitySimulation(supi, duration, sleepSeconds, startTime):
    while True:
        if time.time() - startTime >= duration:
            break
        for elem in [1,2,3,4]:
            producer.send(locationTopic, {"value" : elem})
        time.sleep(sleepSeconds)


if __name__ == '__main__':
    app.debug = True
    app.run()
