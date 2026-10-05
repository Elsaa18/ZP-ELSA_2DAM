package DAM2.tema1.ejemplos;

import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

public class Ejemplo3 {
    public static void main(String[] args) throws IOException {
        Path raiz = Path.of("/home/diurno/eclipse-workspace/ZP_ELSA_2DAM/src/DAM2/tema1/ejemplos/catalogo");

        //Te da un listado con las rutas de los archivos que halla en la carpeta "catalogo" pero si son carpetas solo te da el nombre no lo que halla dentro
        try (Stream<Path> listado = Files.list(raiz)) {
            listado.forEach(System.out::println);
        }

        // Recorrer TODO el árbol de subdirectorios (recursivo)
        try (Stream<Path> arbol = Files.walk(raiz)) {
            arbol.filter(Files::isRegularFile).forEach(p -> System.out.println("Fichero encontrado: " + p));
        }
    }
}
