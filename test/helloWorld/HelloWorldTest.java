package helloWorld;

import uk.co.placona.helloWorld.HelloWorld;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest{
	
	int minutos;
	int segundos;
	HelloWorld c;

	@Test
	public void test01(){
		
		c = new HelloWorld();
		minutos = c.mostrarMinutos();
		segundos = c.mostrarSegundos();
		
		assertEquals(0,minutos);
		assertEquals(0,segundos);
	}
	
	@Test
	public void test02(){
		c = new HelloWorld();
		for (int i=0; i < 120; i++) {
			 c.incrementarTiempo();
		}
		assertEquals(0,c.mostrarSegundos());
	}
}
