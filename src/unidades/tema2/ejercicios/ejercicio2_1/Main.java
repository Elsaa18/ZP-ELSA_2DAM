package unidades.tema2.ejercicios.ejercicio2_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		System.out.println("Dime tu nombre");
		nombre= teclado.next();
		
		System.out.println("Hola " + nombre);
	}

}
