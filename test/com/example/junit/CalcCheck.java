package com.example.junit;

import com.example.junit.Calc;

import junit.framework.TestCase;

public class CalcCheck extends TestCase{
	
	Calc calc = new Calc();
	int value = 2;
	
	public void setUp (){
		System.out.println("Setup");
	}
	
	public void tearDown (){
		System.out.println("TearDown()");
	}
	
	public void testAdding() {
		value = 6;
		System.out.println("Value in test 1: " + value);
		assertEquals(5, calc.add(2, 3));
		assertEquals(6, calc.add(3, 3));
	}
	
	
	public void testAdding2() {
		System.out.println("Value in test 1: " + value);
		value = 7;
		assertEquals(5, calc.add(2, 3));
		assertEquals(6, calc.add(3, 3));
	}

	
	
/*	@BeforeClass
	public static void globalSetup () {
		System.out.println("global setup");
	}
	
	@AfterClass 
	public static void globalCleanup(){
		System.out.println("global cleanup");
	}
		
	@Test(expected = ArithmeticException.class)
	public void checkAddingException() {
		calc.add(2, 0);
	}
	*/
/*	@Test
	public void checkAdding() {
		value = 6;
		System.out.println("Value in test 1: " + value);
		assertEquals(5, calc.add(2, 3));
		assertEquals(6, calc.add(3, 3));
	}
	
	@Test
	public void checkAdding2() {
		System.out.println("Value in test 1: " + value);
		value = 7;
		assertEquals(5, calc.add(2, 3));
		assertEquals(6, calc.add(3, 3));
	}*/
}
