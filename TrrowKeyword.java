package com.java.exception;

public class TrrowKeyword {

	public static void main(String[] args) {

		validateAge(14);
		System.out.println("Rest of the code");

	}

	public static void validateAge(int age) {

		if (age < 18) {
			throw new ArithmeticException("Person is not elgible for Vote");
		} else {
			System.out.println("Person is elgible for Vote");
		}
	}

}
