package com.example.appdendency.algorithms;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

import com.example.appdependecy.algorithms.BinarySearch;

@ContextConfiguration
public class BinarySearchTests {

	static int[] sortedArray = null;
	static int[] unsortedArray = null;

	@BeforeAll
	static void setup() {
		sortedArray = new int[] { 1, 2, 4, 5, 6 };
		unsortedArray = new int[] { 3, 2, 1, 4 };
	}

	@Test
	void testBinarySearchIsInstantiable() {
		BinarySearch binarySearch = new BinarySearch();
		assertThat(binarySearch).isNotNull();
	}
	
	@Test
	void testBinarySearchUnsortedArrayNotFound() {
		assertEquals(-1, BinarySearch.binarySearch(unsortedArray, 0));
		assertEquals(-1, BinarySearch.binarySearch(unsortedArray, 3));
		assertEquals(-1, BinarySearch.binarySearch(unsortedArray, 2));
	}

	@Test
	void testBinarySearchKeyIsNotFound() {
		assertEquals(-1, BinarySearch.binarySearch(sortedArray, 0));
		assertEquals(-1, BinarySearch.binarySearch(sortedArray, 3));
	}

	@Test
	void testBinarySearchKeyIsFoundInPosition() {
		assertEquals(0, BinarySearch.binarySearch(sortedArray, 1));
		assertEquals(2, BinarySearch.binarySearch(sortedArray, 4));
		assertEquals(4, BinarySearch.binarySearch(sortedArray, 6));
	}

	@Test
	void testBinarySearchIndexOutOfBounds() {
		assertThrows(IndexOutOfBoundsException.class, () -> BinarySearch.binarySearch(sortedArray, 7));
	}
}
