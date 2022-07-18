package com.java.exception;

public class NullPointerExcept {

	public static void main(String[] args) {

		try {

			//String s = null;
			//System.out.println(s.length());
			
			int a[] = {10,20,30};
			System.out.println(a[30]);
			
		} catch (Exception e) {
	        //e.printStackTrace();
	        
	        System.out.println(e.getMessage());
	        System.out.println(e.toString());
		}
		

	}

}
