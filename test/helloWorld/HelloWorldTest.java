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
	}
	
	@Test
	public void test02(){
		assertEquals(0,segundos);
	}
	
	@Test
	public void test03(){
		c = new HelloWorld();
		for (int i=0; i < 120; i++) {
			 c.incrementarTiempo();
		}
		
		segundos=c.mostrarSegundos();
		minutos=c.mostrarMinutos();
		assertEquals(0,segundos);
	}
	
	@Test
	public void test04(){
		assertEquals(2,minutos);
	}
}
