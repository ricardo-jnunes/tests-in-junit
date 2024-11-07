package com.example.projeto1;

import com.example.appdependecy.numberstools.EvenOdd;

public class NumberResponse {

	private int number;
	private boolean even;
	private String value;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isEven() {
		return even;
	}

	public void setEven(boolean even) {
		this.even = even;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static NumberResponse build(int number) {
		NumberResponse numberResponse = new NumberResponse();
		numberResponse.setNumber(number);
		numberResponse.setEven(EvenOdd.isEven(number));
		numberResponse.setValue(EvenOdd.isEvenOrOdd(number));
		return numberResponse;
	}

}
