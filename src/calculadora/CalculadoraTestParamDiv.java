package calculadora;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class CalculadoraTestParamDiv {

private int num1,num2;
private Integer resultado;
	
	public CalculadoraTestParamDiv(int num1, int num2, Integer resultado) {
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = resultado;
	}
	
	@Parameters
	public static Collection<Object[]>numeros(){
		return Arrays.asList(new Object[][]{ {1,1,1},
											  {4,0,null},
		});
	}
	
	
	@Test
	public void testResta() {
		Calculadora calcu=new Calculadora(num1, num2);
		Integer resultadoreal=calcu.division2();
		assertEquals(resultado, resultadoreal);
	}
}
