package com.jos.dem.spring.webflux.jackson.xml;

import com.jos.dem.spring.webflux.jackson.xml.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@Autowired
	private WebTestClient webClient;

	@Test
	void contextLoads() {
		webClient.get().uri("/")
						.exchange()
						.expectStatus().isOk()
						.expectHeader().contentType(APPLICATION_XML_VALUE)
						.expectBody(Person.class);
	}

}
