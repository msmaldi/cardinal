package br.com.maldi.cardinal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class CardinalApplicationTests
{
	@Autowired
	private WebTestClient webTestClient;

	@Test
	void status()
	{
		var response = webTestClient.get().uri("/status").exchange();

		response.expectStatus().isOk();
	}

}
