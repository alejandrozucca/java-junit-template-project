package uk.co.placona.helloWorld;

public class HelloWorld {

	private int segundos, minutos;
	
	public HelloWorld(){
		segundos = 0;
		minutos = 0;
	}
	
	public void reiniciar(){
		segundos = 0;
		minutos = 0;
	}
	
	public void incrementarTiempo(){
				
		if(segundos >= 60){
			minutos++;
			segundos = 0;
		}
		else segundos++;
	}
	
	public int mostrarMinutos(){
		return minutos;
	}
	
	public int mostrarSegundos(){
		return segundos;
	}

}
