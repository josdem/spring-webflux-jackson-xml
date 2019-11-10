package com.jos.dem.spring.webflux.jaxb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Device {
  @XmlAttribute
  private String name;
  @XmlAttribute
  private String os;
  @XmlAttribute
  private String model;
}
