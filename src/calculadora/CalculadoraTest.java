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
		assertEquals(-10, resultado);
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
	public void testDivisionPorCero() {
		try {
			Calculadora calcu= new Calculadora(8,0);
			int resultado=calcu.division();
			fail(("inutil deberias haber lanzado la excepcion gomarrota"));
		}catch(ArithmeticException e) {
			
		}
		
	}
	

}
