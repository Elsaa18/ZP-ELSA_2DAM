package unidades.tema2.ejercicios.ejercicio3_4;

public class NumeroAleatorioRedondeado {

	public static void main(String[] args) {

		double numAleatorio = (Math.random()*10);
		System.out.println(numAleatorio);
		
		System.out.println(Math.round(numAleatorio));
	
		
		double numAleatorio2 = (Math.random()*100);
		System.out.println(numAleatorio2);
		
		System.out.println(Math.round(numAleatorio2));
		
	}

}
