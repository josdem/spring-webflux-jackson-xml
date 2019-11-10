package com.jos.dem.spring.webflux.jaxb.repository;

import java.util.Map;
import java.util.HashMap;

import javax.annotation.PostConstruct;
import reactor.core.publisher.Mono;

import org.springframework.stereotype.Service;

import com.jos.dem.spring.webflux.jaxb.model.Person;
import com.jos.dem.spring.webflux.jaxb.model.Device;

@Service
public class PersonRepository{

  private Map<String, Person> persons = new HashMap<String, Person>();

  @PostConstruct
  public void setup(){
    Device device = new Device("Pixel 3","Android","9 Pie");
    persons.put("josdem", new Person("josdem", "Jose", "Morales", "30 Frank Lloyd, Ann Arbor MI 48105", device));
  }

  public Mono<Person> findOne(String nickname){
    return Mono.just(persons.get(nickname));
  }

}
