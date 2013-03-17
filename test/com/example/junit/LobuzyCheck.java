package com.example.junit;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LobuzyCheck {
	public LobuzyCheck(Integer liczba, List<Integer> wyniki, Integer liczba1, 
			List<Integer> wyniki1, Integer liczba2, List<Integer> wyniki2) {
		super();
		this.liczba = liczba;
		this.liczba1 = liczba1;
		this.liczba2 = liczba2;
		this.wyniki = wyniki;
		this.wyniki1 = wyniki1;
		this.wyniki2 = wyniki2;
	}

	private Integer liczba;
	private Integer liczba1;
	private Integer liczba2;
	private List<Integer> wyniki;
	private List<Integer> wyniki1;
	private List<Integer> wyniki2;

	@Test
	public void checkUsuwaniaCyfrokrad () {	
		Integer wynik = Lobuzy.cyfrokrad(liczba);
		if (liczba < 10) {
			assertEquals(null, wynik);
		} else {
			assertEquals(liczba.toString().length(),wynik.toString().length() + 1);
			assertThat(wyniki, hasItem(wynik));	
		} 
	}
	
	@Test
	public void checkHultajchochla() {	
		Integer wynik = Lobuzy.hultajchochla(liczba1);
		assertThat(wyniki1, hasItem(wynik));		
	}
	
	@Test
	public void checkNieksztaltek() {	
		Integer wynik = Lobuzy.nieksztaltek(liczba2);
		assertThat(wyniki2, hasItem(wynik));		
	}
	
	@Parameters
	public static Collection<Object[]> addingTest() {
		return Arrays.asList(
				new Object[][]{
						/*						
 						cyfrokrad(Integer liczba)
						hultajchochla(Integer liczba)
						nieksztaltek(Integer liczba)	
						*/
						{	
							123,Arrays.asList(12,13,23),
							123,Arrays.asList(123,132,213,231,312,321),
							1257669, Arrays.asList(1257669, 7257669,1257999)//nie musi nic zmieniać
						},
						{	
							1, null, 
							1, Arrays.asList(1),
							33816, Arrays.asList(33876,33819,88816) // coś musi zamienić
						},
						{	
							10, Arrays.asList(1,0), 
							11, Arrays.asList(11),
							2457890, Arrays.asList(2457890) // nic nie może zmienić
						} 
				});
		
	}
}
