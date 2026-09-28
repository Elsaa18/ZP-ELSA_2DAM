package unidades.tema5.gestorVideojuegos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GestorTienda {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		ArrayList<Videojuego> videojuegos = new ArrayList<>();

		Videojuego v = new Videojuego();
		int opcion = 0;
		do {
			System.out.println("\n===== MENÚ DE GESTIÓN =====");
			System.out.println("1. Añadir Videojuego");
			System.out.println("2. Eliminar por Título");
			System.out.println("3. Búsqueda Inteligente");
			System.out.println("4. Cambiar Prioridad de Escaparate (Swap)");
			System.out.println("5. Análisis de Precios (Clase Math)");
			System.out.println("6. Listado Completo");
			System.out.println("7. Salir");
			System.out.print("Selecciona una opción: ");

			opcion = teclado.nextInt();
			teclado.nextLine();

			if (opcion == 1) {
				System.out.println("Dime el nombre del juego: ");
				v.setTitulo(teclado.nextLine());

				System.out.println("Dime el genero del juego: ");
				v.setGenero(teclado.nextLine());

				System.out.println("Dime el precio base del juego: ");
				v.setPrecioBase(teclado.nextDouble());
				teclado.nextLine();

				while (true) {
					System.out.println("Dime la valoracion del juego: ");
					v.setValoracion(teclado.nextInt());
					teclado.nextLine();

					if (v.getValoracion() >= 0 && v.getValoracion() <= 100) {
						break;
					} else {
						System.out.println("La valoracion no esta bien puesta");
						continue;
					}
				}
				Videojuego v1 = new Videojuego(v.getTitulo(), v.getGenero(), v.getPrecioBase(), v.getValoracion());
				videojuegos.add(v1);
			} else if (opcion == 2) {
				System.out.println("Deseas borrar algun titulo: ");

				System.out.println("Que juegop quieres borrar");
				String nombreBorrar = teclado.nextLine();

				for (int i = 0; i < videojuegos.size(); i++) {
					if (videojuegos.get(i).getTitulo().equalsIgnoreCase(nombreBorrar)) {
						videojuegos.remove(i);
						i--;
					}

				}

			} else if (opcion == 3) {
				System.out.println("Introduce lo que quieres buscar: ");
				String caracterABuscar = teclado.nextLine();

				for (int i = 0; i < videojuegos.size(); i++) {
					if (videojuegos.get(i).getTitulo().contains(caracterABuscar)) {
						System.out.println(videojuegos.get(i).getTitulo().toLowerCase());
					}

				}
			} else if (opcion == 4) {

			} else if (opcion == 5) {

				for(int i=0;i<videojuegos.size();i++) {
				
					
					double precioMasCaro = Math.max(videojuegos.get(i).getPrecioBase(), videojuegos.get(0).getPrecioBase());
					
					double precioIVA = Math.ceil(precioMasCaro*1.21);
					
					System.out.println("El precio mas caro es: "+ precioMasCaro+ " del juego " + videojuegos.get(i).getTitulo());
					System.out.println("El precio con IVA es: " + precioIVA);
				}
			} else if (opcion == 6) {
				if(videojuegos.isEmpty()) {
					System.out.println("No hay juegos en el inventario");
				}
				else {
					for(int i=0;i<videojuegos.size();i++) {
						System.out.println(videojuegos.get(i));
						
					}
				}
			}

			else if (opcion == 7) {
				System.out.println("Saliendo del gestor... ¡Buen día!");

			} else {
				System.out.println("Opción incorrecta. Introduce un número del 1 al 7.");
			}

		} while (opcion != 7);
		teclado.close();
	}

}
