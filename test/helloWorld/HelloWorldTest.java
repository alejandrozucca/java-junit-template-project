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
		minutos = c.mostrarMinutos();
		segundos = c.mostrarSegundos();
		
		assertEquals(0,minutos);
		assertEquals(0,segundos);
	}
	
	@Test
	public void test02(){
		for (int i=0; i < 60; i++) {
			 c.incrementarTiempo();
		}
		assertEquals(60,c.mostrarSegundos());
	}
}
