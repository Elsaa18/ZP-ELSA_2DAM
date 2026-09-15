package unidades.tema2.ejercicios.ejercicio2_2;

import java.util.Scanner;

public class Rectangulo {

	private double base;
	private double altura;
	
	public void calcularArea() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Cual es la medida de su base: ");
		base = teclado.nextDouble();
		
		System.out.println("Cual es la medida de su altura: ");
		altura = teclado.nextDouble();

		
		double area=base*altura;
		System.out.print("El area es: "+ area);
		 
			
	}
}
