package unidades.tema2.ejercicios.ejercicio7_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado= new Scanner(System.in);
	
		System.out.println("Dime un texto largo: ");
		String texto = teclado.nextLine();
		
		String textoSinEspacios = texto.trim();
		
		System.out.println("Longitud texto: " + textoSinEspacios.length());
	
	
	}

}
