package com.example.projeto2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/algorithms")
public class BinarySearchController {

	@PostMapping
	@RequestMapping("/binarysearch")
	public BinarySearchResponse retornaResultado(@RequestParam("sortedArray") int[] sortedArray,
			@RequestParam("key") int key) {
		return BinarySearchResponse.build(sortedArray, key);
	}
}
