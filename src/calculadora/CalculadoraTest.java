package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora calcu= new Calculadora(20,30);
		int resultado=calcu.suma();
		assertEquals(50, resultado);
	}

	@Test
	public void testResta() {
		Calculadora calcu= new Calculadora(20,30);
		int resultado=calcu.resta();
		assertEquals(10, resultado);
	}
	@Test
	public void testNum1EsMayor() {
		Calculadora calcu= new Calculadora(20,30);
		boolean resultado=calcu.num1EsMayor();
		// asertEquals(false,resultado);
		assertFalse(resultado);
	}

	@Test
	public void testMultiplicacion() {
		Calculadora calcu= new Calculadora(20,30);
		int resultado=calcu.multiplicacion();
		assertEquals(600, resultado);
	}

	@Test
	public void testDivision() {
		Calculadora calcu= new Calculadora(8,2);
		int resultado=calcu.division();
		assertEquals(4, resultado);
	}
	@Test
	public void testDivision2() {
		Calculadora calcu= new Calculadora(8,2);
		int resultado=calcu.division();
		assertEquals(4, resultado);
	}
	
	@Test
	public void testDivisionPorCero() {
		Calculadora calcu= new Calculadora(20,0);
		Integer resultado = calcu.division2();
		assertNull(resultado);
	}
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivision3() {
		Calculadora calcu= new Calculadora(20,0);
		int resultado = calcu.division3();

	}

}
