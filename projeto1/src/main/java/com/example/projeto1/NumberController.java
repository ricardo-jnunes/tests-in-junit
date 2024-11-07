package com.example.projeto1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {

	@PostMapping
	@RequestMapping("/even/{number}")
	public NumberResponse retornaPar(@PathVariable int number) {
		return NumberResponse.build(number);
	}
}
