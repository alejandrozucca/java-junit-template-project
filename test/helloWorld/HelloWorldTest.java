package helloWorld;

import uk.co.placona.helloWorld.Cronometro;
import org.junit.Test;
import static org.junit.Assert.AssertEquals;

public class HelloWorldTest{

	@Test
	public void test01(){
		
		Cronometro c = new Cronometro();
		
		for (int i=0; i < 5000; i++) {
			  c.incrementarTiempo();
			}
		
		int minutos = c.mostrarMinutos();
		int segundos = c.mostrarSegundos();
		
		Assert.assertTrue(minutos==5);
		Assert.assertTrue(segundos==3);
	}
}
