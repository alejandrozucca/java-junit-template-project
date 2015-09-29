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
		
		assertEquals(minutos,5);
		assertEquals(segundos,3);
	}
}
