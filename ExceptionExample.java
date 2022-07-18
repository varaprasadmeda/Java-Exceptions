package com.java.exception;

public class ExceptionExample {

	public static void main(String[] args) {

		try {
			int data = 100 / 0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			int data = 100 / 5;
			System.out.println(data);
			System.out.println("Success to rest of the program");
		}finally {
			System.out.println("Finally block");
		}

	}

}
