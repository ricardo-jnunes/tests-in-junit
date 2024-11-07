package com.example.appdependecy.numberstools;

import org.springframework.stereotype.Component;

@Component
public class EvenOdd {

	public static final String ODD = "odd";
	public static final String EVEN = "even";

	public static boolean isEven(int number) {
		return (number % 2) == 0;
	}

	public static boolean isOdd(int number) {
		return (number % 2) != 0;
	}

	public static String isEvenOrOdd(int number) {
		return isEven(number) ? EVEN : ODD;
	}
}
