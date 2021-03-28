package com.example.accessingairbnbdatarest.domain;

import org.springframework.data.annotation.Id;

public class ListingsAndReviews {

  @Id private String id;

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}