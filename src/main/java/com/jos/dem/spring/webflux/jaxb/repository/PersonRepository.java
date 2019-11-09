package com.jos.dem.spring.webflux.jaxb.jaxb.repository;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class PersonRepository{

  private Map<String, Person> persons = new HashMap<String, Person>();

  @PostConstruct
  public void setup(){
    Device device = new Device("Pixel 3","Android","9 Pie");
    persons.put("josdem", new Person("josdem", "Jose", "Morales", "30 Frank Llord, Ann Arbor MI 48105", device));
  }

  public Person findOne(String nickname){
    return persons.get(nickname);
  }

}
