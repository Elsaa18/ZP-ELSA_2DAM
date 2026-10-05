package DAM2.tema1.apuntes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Apuntes {

	public static void main(String[] args) {
		
		//Dibuja rutas y rutas nuevas las cuales sino existen las dibuja para luego crearlas
		Path carpetaCatalogo = Path.of("/home/diurno/eclipse-workspace/ZP_ELSA_2DAM/src/DAM2/tema1/ejemplos/catalogo");
		Path subcarpetaImagenes = carpetaCatalogo.resolve("imagenes");
		Path ficheroConfig = carpetaCatalogo.resolve("config.txt");
		Path ficherodup = carpetaCatalogo.resolve("duplicado.txt");
		try {
			//Crea esa carpeta
			Files.createDirectories(subcarpetaImagenes);
			
			
			//Sino existe la ruta la crea
			if (!Files.exists(ficheroConfig)) {
				//Crea ese archivo - siempre en if-si no existe
				Files.createFile(ficheroConfig);
			}
			if(!Files.exists(ficherodup)) {
				Files.createFile(ficherodup);

			}
		} catch (IOException e) {
			System.err.println("Error al crear la estructura de directorios: " + e.getMessage());
		}

	}

}
