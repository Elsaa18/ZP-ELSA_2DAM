package DAM2.tema1.ejemplos;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class EscrituraFicheroDeTexto {

	public static void main(String[] args) {
		List<String> productos = List.of("Teclado mecánico", "Ratón inalámbrico", "Monitor 27\"");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("catalogo/productos.txt", StandardCharsets.UTF_8))) {

			for (String producto : productos) {
				bw.write(producto);
				bw.newLine(); // salto de línea multiplataforma
			}
		} catch (IOException e) {
			System.err.println("Error de escritura: " + e.getMessage());
		}
	}

}
