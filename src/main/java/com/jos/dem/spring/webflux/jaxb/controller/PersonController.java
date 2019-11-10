package com.jos.dem.spring.webflux.jaxb.controller;

import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import com.jos.dem.spring.webflux.jaxb.model.Person;
import com.jos.dem.spring.webflux.jaxb.repository.PersonRepository;

@RestController
public class PersonController {

  @Autowired
  private PersonRepository personRepository;

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @GetMapping(value = "/", produces = APPLICATION_XML_VALUE)
  public Mono<Person> index() {
    log.info("Getting Person");
    return personRepository.findOne("josdem");
  }

}
