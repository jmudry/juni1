/*package com.example.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCheck {
	public static Calc calc = new Calc();
	
	public ParamCheck(int arg1, int arg2, int result) {
		super();
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.result = result;
	}
	private int arg1;
	private int arg2;
	private int result;
	
	@Test(timeout = 10000)
	public void test(){
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		System.out.println("Testing arg1 = " + arg1 + " arg 2 = " + arg2 + " result = " + result );
		assertEquals(result,calc.add(arg1,arg2));
	}
	
	@Parameters
	public static Collection<Object[]> addingTest() {
		return Arrays.asList(
				new Object[][]{
						{1,2,3},
						{4,5,9},
						{3,6,9}
				});
		
	}
	
	
	
}
*/