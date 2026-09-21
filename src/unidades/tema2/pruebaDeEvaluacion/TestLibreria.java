package unidades.tema2.pruebaDeEvaluacion;

import java.util.Scanner;

public class TestLibreria {
	

	public static void main(String[] args) {

		String titulo;
		String autor;
		double precio;
		String comentario;
		int descuento;
		String libreriaJava= "Lecturas Java";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime el titulo del libro: ");
		titulo = teclado.nextLine();

		System.out.println("Dime el autor del libro: ");
		autor = teclado.nextLine();

		System.out.println("Dime el precio del libro: ");
		precio = teclado.nextDouble();
		teclado.nextLine();
		
		System.out.println("Dime un comentario sobre el libro: ");
		comentario = teclado.nextLine();

		System.out.println("Dime el porcentaje de descuento del libro: ");
		descuento = teclado.nextInt();

		Libro libro1 = new Libro(titulo, autor, precio, comentario);
		
		double precioConDescuento = Descuento.calcularPrecioConDescuento(precio, descuento);
		Libreria libreria1 = new Libreria(libreriaJava, libro1);
		
		//RESULTADO
		System.out.println("\n--- Resultado ---");
		System.out.println("ISBN generado: " + libro1.getIsbn());
		System.out.println("Libro: " + libro1.getTitulo());
		System.out.println("Autor: " + libro1.getAutor());
		System.out.println("Precio original: " + libro1.getPrecio());
		System.out.println("Precio con descuento: " + precioConDescuento);
		libro1.procesarComentario();
		System.out.println("\n");
		
		System.out.println("Libreria: " + libreriaJava);
		libreria1.mostrarLireria(); 
		
		
		teclado.close();
		
		
		
		
	}


}
