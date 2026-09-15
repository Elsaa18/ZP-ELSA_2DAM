package unidades.tema2.ejercicios.ejercicio2_3;

import java.util.Scanner;

public class Libro {

	private String titulo;
	private String autor;
	
	public void mostrarInfo() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Cual es el titulo: ");
		titulo = teclado.next();
		
		System.out.println("Cual es el autor: ");
		autor = teclado.next();

		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
	}
	
}
