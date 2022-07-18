package com.java.exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];

			a[5] = 30 / 0;
			
			String s =null;
			System.out.println(s.length());
			
			int b[] = {10,30,50};
			System.out.println(b[10]);
		}catch(ArithmeticException e) {
			// TODO: handle exception
		}catch (NullPointerException e) {
			// TODO: handle exception
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
