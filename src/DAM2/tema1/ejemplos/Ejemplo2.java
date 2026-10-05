package DAM2.tema1.ejemplos;

import java.nio.file.*;
import java.io.IOException;

public class Ejemplo2 {
    public static void main(String[] args) throws IOException {
        Path origen  = Path.of("/home/diurno/eclipse-workspace/ZP_ELSA_2DAM/src/DAM2/tema1/ejemplos/catalogo/config.txt");
        Path copia   = Path.of("/home/diurno/eclipse-workspace/ZP_ELSA_2DAM/src/DAM2/tema1/ejemplos/catalogo/config_copia.txt");
        Path destino = Path.of("/home/diurno/eclipse-workspace/ZP_ELSA_2DAM/src/DAM2/tema1/ejemplos/catalogo/backup/config.txt");

        //COPIAR
        // Crea un archivo duplicado en la ruta copia (si ya existia uno con ese nombre lo borra y añade el nuevo)
        Files.copy(origen, copia, StandardCopyOption.REPLACE_EXISTING);

        //CORTAR
        //Crea la carpeta añadida en la ruta que no existe
        Files.createDirectories(destino.getParent());
        //Quita el archivo de la ruta copia y lo mueve a la ruta destino(si ya existia uno con ese nombre lo borra y añade el nuevo)
        Files.move(copia, destino, StandardCopyOption.REPLACE_EXISTING);
     
        //devolverlo a su carpeta original
        Files.move(destino, origen, StandardCopyOption.REPLACE_EXISTING);


        // BORRAR
        //Borra el archivo si existe en esa ruta sino no hace nada
        boolean borrado = Files.deleteIfExists(Path.of("/home/diurno/eclipse-workspace/ZP_ELSA_2DAM/src/DAM2/tema1/ejemplos/catalogo/fichero_temporal.tmp"));
        System.out.println("¿Se borró el fichero temporal? " + borrado);
        
    }
}
