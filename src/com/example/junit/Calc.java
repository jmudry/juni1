package com.example.junit;


public class Calc {
	
	public int add(int a, int b) {
		System.out.println("add("+a+","+b+")");
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a+b;
	}
}


