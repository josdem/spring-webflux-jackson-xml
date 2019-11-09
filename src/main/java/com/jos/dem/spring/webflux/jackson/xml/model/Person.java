package com.jos.dem.spring.webflux.jackson.xml.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Person {
  private String firstName;
  private String lastName;
  private String address;
}
