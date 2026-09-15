package unidades.tema2.ejercicios.ejercicio3_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String nombre;
		String edad;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cual es tu nombre");
		nombre= teclado.next();
		
		System.out.println("Cuantos años tienes: ");
		edad=teclado.next();
		
		System.out.println("Hola " + nombre+" tienes "+edad+" años");
				
				
	}

}
