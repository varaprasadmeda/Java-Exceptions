package com.java.exception;

public class ScannerExample {

	public static void main(String[] args)  {

		int a= 10;
		int b =20;
		
		if(a == b) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		Object ob1 = new Object();
		Object ob2 = new Object();
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		
		//Object class   equals method
		if (ob1.equals(ob2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		String username = new String("Varaprasad");
		String paswword = new String("VARAPRASAD");
	
		if (username.equalsIgnoreCase(paswword)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
