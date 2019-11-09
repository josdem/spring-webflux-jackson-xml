package com.jos.dem.spring.webflux.jackson.xml.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
  private String firstName;
  private String lastName;
  private String address;
}
