package DAM2.tema1.ejercicios;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Ejercicio0 {

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);
		
		
		int opcion =0;
		do {
		
		    System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Mostrar la ruta absoluta de la carpeta actual.");
            System.out.println("2. Ver detalles de un fichero o carpeta (existencia, tipo, fecha, tamaño).");
            System.out.println("3. Mostrar el contenido de una carpeta.");
            System.out.println("4. Crear una nueva carpeta en la ruta por defecto.");
            System.out.println("5. Crear un nuevo fichero.");
            System.out.println("6. Renombrar un fichero.");
            System.out.println("7. Salir del programa.");
            System.out.println("Elige una opción: ");
			opcion = teclado.nextInt();
			teclado.nextLine();
			
			   if (opcion == 1) {
					//Indica la ruta del archivo en el que estamos
					Path rutaArchivo = Path.of("").toAbsolutePath();
					System.out.println(""+rutaArchivo);
	            } 
	            else if (opcion == 2) {
	            	System.out.println("Dime la ruta del fichero o la carpeta");
	            	String rutaUsuario = teclado.nextLine();
	            	Path rutaUsuario1 = Path.of(rutaUsuario);
	            	if(Files.exists(rutaUsuario1)) {
	            		if(Files.isDirectory(rutaUsuario1)) {
	            			
	            		}
	            		else if(Files) {
	            			
	            		}
	            	}
	            	else {
	            		System.out.println("Ruta inexistente");
	            	}
	            	
	            } 
	            else if (opcion == 3) {

	            } 
	            else if (opcion == 4) {

	            } 
	            else if (opcion == 5) {

	            } 
	            else if (opcion == 6) {

	            } 
	            else if (opcion == 0) {
	                System.out.println("Saliendo del programa... ¡Hasta luego!");
	            } 
	            else {
	                System.out.println("Opción no válida. Por favor, introduce un número del 0 al 6.");
	            }
			
		}while(opcion!=7);
		
	
	}

}
