package DAM2.tema1.ejemplos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ejemplo1 {
    public static void main(String[] args) {
    	//Dibuja la ruta donde va a poner la carpeta catalogo(si solo pusiera una ruta ya creada no haria nada pero al añadir catalogo que no existe luego podra añadir la carpeta)
        Path carpetaCatalogo = Path.of("/home/diurno/eclipse-workspace/ZP_ELSA_2DAM/src/DAM2/tema1/ejemplos/catalogo");
        
        //Igual que lo anterior pero con "imagenes". EL .resolve añade / o \ a la ruta segu el sistema operativo 
        Path subcarpetaImagenes = carpetaCatalogo.resolve("imagenes");

        try {
        	//Crea las carpetas catalogo/imagenes si no existen y si ya existen no hace nada
        	Files.createDirectories(subcarpetaImagenes);
            System.out.println("Directorios creados correctamente.");

            //Añade un fichero txt a la carpeta catalogo
            Path ficheroConfig = carpetaCatalogo.resolve("config.txt");
         
            //Sino existe el archivo config.txt lo crea 
            if (!Files.exists(ficheroConfig)) {
                Files.createFile(ficheroConfig);
            }
        } catch (IOException e) {
            System.err.println("Error al crear la estructura de directorios: " + e.getMessage());
        }
    }
    
}
