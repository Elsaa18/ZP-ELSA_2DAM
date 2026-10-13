package DAM2.tema1.ejercicios.ejercicio4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;


public class Ejercicio4 {

	public static void main(String[] args) {
		
		Path ficheroRenombrado = Path.of("/home/diurno/eclipse-workspace/ZP_ELSA_2DAM/src/DAM2/tema1/ejercicios/ejercicio4/ejercicio4.txt");


		
		try (BufferedReader br = new BufferedReader(new FileReader(ficheroRenombrado.toFile(), StandardCharsets.UTF_8))) {
			
			System.out.println("==============================PERSONAS==============================");
			String linea;
			int numeroLinea = 0;
			while ((linea = br.readLine()) != null) {
				String[] partes = linea.split(";");
				String nombre = partes[0];
				String apellido = partes[1];
				String fechaNacimiento = partes[2];
				
				System.out.println("Nombre:" + nombre + " --- Apellido:" + apellido+ " --- Fecha de nacimiento:"+ fechaNacimiento);
				
				numeroLinea++;
			}
			System.out.println("Hay " + numeroLinea+ " personas escritas en el fichero");
		} catch (IOException e) {
			System.err.println("Error de lectura: " + e.getMessage());
		}
		
	}
}