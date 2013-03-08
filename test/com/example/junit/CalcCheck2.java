package com.example.junit;
import org.junit.*;

import com.example.junit.Calc;

import junit.framework.TestCase;
import static org.junit.Assert.*;

public class CalcCheck2 {
	
	Calc calc = new Calc();
	int value = 2;

	@BeforeClass
	public static void globalSetup () {
		System.out.println("global setup");
	}
	
	@AfterClass 
	public static void globalCleanup(){
		System.out.println("global cleanup");
	}
	
	@Before
	public void start() {
		System.out.println("setUp()");
	}
	
	@After 
	public void end(){
		System.out.println("tearDown()");
	}
	
	
	@Test(expected = DeltaException.class)
	public void checkDelta () throws DeltaException{
		Trojmian.licz(4, 0, 4); // -4*4*4 < 0
	}
	
	@Test
	public void checkDeltaTwo () throws DeltaException{
		ParaLiczb para = Trojmian.licz(2,5,3); // -6, -4
		assertEquals(-6, para.getFirst(), 0.0001);
		assertEquals(-4, para.getSecond(), 0.0001);
	}
	
	@Test
	public void checkDeltaTesame () throws DeltaException{
		ParaLiczb para = Trojmian.licz(1,-2,1); //1,1
		assertEquals(1, para.getFirst(), 0.0001);
		assertEquals(1, para.getSecond(), 0.0001);
		assertEquals(para.getFirst(), para.getSecond(), 0.0001);
	}
	
	@Test(expected = DeltaException.class)
	public void checkDeltaWspolczynnik () throws DeltaException{
		ParaLiczb para = Trojmian.licz(0,-2,1); 
	}
	
}
