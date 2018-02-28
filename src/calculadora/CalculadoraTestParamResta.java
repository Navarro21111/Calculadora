package calculadora;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class CalculadoraTestParamResta {

private int num1,num2,resultado;
	
	public CalculadoraTestParamResta(int num1, int num2, int resultado) {
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = resultado;
	}
	
	@Parameters
	public static Collection<Object[]>numeros(){
		return Arrays.asList(new Object[][]{ {20,30,10},
											  {30,-2,32},
											  {5,2,3},
											  {1,1,0},
		});
	}
	
	
	@Test
	public void testResta() {
		Calculadora calcu=new Calculadora(num1, num2);
		int resultadoreal=calcu.resta();
		assertEquals(resultado, resultadoreal);
	}

}
