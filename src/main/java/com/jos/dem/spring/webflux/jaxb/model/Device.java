package com.jos.dem.spring.webflux.jaxb.jaxb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
i
@AllArgsConstructor
@XmlRootElement
public class Device {
  private String name;
  private String os;
  private String model;
}
