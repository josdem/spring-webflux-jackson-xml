package com.jos.dem.spring.webflux.jaxb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Person {
  @XmlAttribute
  private String nickname;
  @XmlAttribute
  private String firstName;
  @XmlAttribute
  private String lastName;
  @XmlAttribute
  private String address;
  @XmlElement
  private Device device;
}
