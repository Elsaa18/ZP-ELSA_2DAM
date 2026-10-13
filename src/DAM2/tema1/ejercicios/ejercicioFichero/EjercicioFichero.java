package DAM2.tema1.ejercicios.ejercicioFichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class EjercicioFichero {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime una palabra a buscar en el fichero");
		String palabra = teclado.nextLine();
		
		Path fichero = Path.of("/home/diurno/eclipse-workspace/ZP_ELSA_2DAM/src/DAM2/tema1/ejercicios/ejercicioFichero/fichero.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(fichero.toFile(), StandardCharsets.UTF_8))) {

			String linea;
			int numeroLinea = 1;
			while ((linea = br.readLine()) != null) {
				if(linea.equalsIgnoreCase(palabra)) {
					System.out.println("Saliendo del programa");
					break;
				}
				System.out.println(numeroLinea + ": " + linea);
				numeroLinea++;
			}
		} catch (IOException e) {
			System.err.println("Error de lectura: " + e.getMessage());
		}
		
		
	}

}
