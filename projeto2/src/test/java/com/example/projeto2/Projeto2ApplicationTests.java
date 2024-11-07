package com.example.projeto2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Projeto2ApplicationTests {

	@Autowired
	private BinarySearchController binarySearchController;

	@Test
	void contextLoads() {
		assertThat(binarySearchController).isNotNull();
	}

}
