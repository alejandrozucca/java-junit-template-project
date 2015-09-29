package helloWorld;

import uk.co.placona.helloWorld.HelloWorld;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest{
	
	int minutos;
	int segundos;

	@Test
	public void test01(){
		
		HelloWorld c = new HelloWorld();
		
		for (int i=0; i < 5000; i++) {
			  c.incrementarTiempo();
			}
		
		minutos = c.mostrarMinutos();
		segundos = c.mostrarSegundos();
		
		assertEquals(minutos,5);
	}
	
	@Test
	public void test02(){
		assertEquals(segundos,3);
	}
}
