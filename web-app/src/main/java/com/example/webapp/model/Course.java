package com.example.webapp.model;

import java.util.List;
import java.util.Objects;

public class Course {
  private int id;
  private String name;
  private String description;
  private List<String> steps;

  public Course() {
  }


  public Course(int id, String name, String description, List<String> steps) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.steps = steps;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public List<String> getSteps() {
    return steps;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Course course = (Course) o;
    return id == course.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "Course{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", description='" + description + '\'' +
        ", steps=" + steps +
        '}';
  }
}
