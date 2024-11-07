package com.example.appdependecy.numberstools;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
public class EvenOddTests {

	@Test
	void testIfNumberIsEven() {
		assertEquals(true, EvenOdd.isEven(0));
		assertEquals(false, EvenOdd.isEven(1));

	}

	@Test
	void testIfNumberIsOdd() {
		assertEquals(false, EvenOdd.isOdd(0));
		assertEquals(true, EvenOdd.isOdd(1));
	}

	@Test
	void testIfNumberIsEvenOrOdd() {
		assertEquals(EvenOdd.EVEN, EvenOdd.isEvenOrOdd(0));
		assertEquals(EvenOdd.ODD, EvenOdd.isEvenOrOdd(1));
	}

}
