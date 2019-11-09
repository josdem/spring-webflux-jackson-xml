package com.jos.dem.spring.webflux.jaxb.jaxb.controller;

import com.jos.dem.spring.webflux.jaxb.jaxb.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
public class PersonController {

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @GetMapping(value = "/", produces = APPLICATION_XML_VALUE)
  public Mono<Person> index() {
    log.info("Getting Person");
    return Mono.just(
            new Person("Jose",
                    "Morales",
                    "30 Frank Lloyd, Ann Arbor MI 48105"));
  }

}
