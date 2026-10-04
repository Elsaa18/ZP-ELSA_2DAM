package unidades.tema5.sistemaAgroalimentario;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCeresExt {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ArrayList<ProductoExtremadura> listaProductos = new ArrayList<>();
		int opcion = 0;

		do {
			System.out.println("=============================================");
			System.out.println(" SISTEMA AGROALIMENTARIO \"CeresExt\" (v2.0) ");
			System.out.println("=============================================");
			System.out.println("1. Alta de Producto");
			System.out.println("2. Listado General");
			System.out.println("3. Búsqueda Detallada");
			System.out.println("4. Actualización de Precio");
			System.out.println("5. Baja de Producto");
			System.out.println("6. Salir");
			System.out.println("=============================================");
			System.out.print("Elige una opción: ");

			try {
				opcion = leer.nextInt();
				leer.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("[ERROR] Entrada no válida. Por favor, introduce un número.");
				leer.nextLine();
				opcion = 0;
				continue;
			}

			if (opcion == 1) {
				System.out.println("--- NUEVO PRODUCTO ---");
				System.out.print("¿Qué tipo de producto deseas registrar? (1: Ibérico, 2: Vegetal): ");
				int tipo = leer.nextInt();
				leer.nextLine();

				System.out.print("Denominación: ");
				String demo = leer.nextLine();
				System.out.print("Precio por kilo (€): ");
				double precio = leer.nextDouble();

				double[] prod = new double[4];
				for (int i = 0; i < 4; i++) {
					System.out.print("Introduce la producción del trimestre " + (i + 1) + " (toneladas): ");
					prod[i] = leer.nextDouble();
				}

				if (tipo == 1) {
					System.out.print("Pureza de raza (50, 75, 100): ");
					int pureza = leer.nextInt();
					ProductoIberico nuevoIberico = new ProductoIberico(demo, precio, prod, pureza);
					listaProductos.add(nuevoIberico);
					System.out.println(
							"> Producto Ibérico registrado con éxito. Código asignado: " + nuevoIberico.getCodigo());
				} else if (tipo == 2) {
					System.out.print("¿Es cultivo ecológico? (true/false): ");
					boolean eco = leer.nextBoolean();
					System.out.print("Número de hectáreas: ");
					double hectareas = leer.nextDouble();
					ProductoVegetal nuevoVegetal = new ProductoVegetal(demo, precio, prod, eco, hectareas);
					listaProductos.add(nuevoVegetal);
					System.out.println(
							"> Producto Vegetal registrado con éxito. Código asignado: " + nuevoVegetal.getCodigo());
				}

			} else if (opcion == 2) {
				System.out.println("--- LISTADO GENERAL DE PRODUCTOS ---");
				if (listaProductos.isEmpty()) {
					System.out.println("No hay productos registrados.");
				} else {
					for (int i = 0; i < listaProductos.size(); i++) {
						ProductoExtremadura p = listaProductos.get(i);
						System.out.println(p.toString());
						System.out.println("-> Producción Anual Total: " + p.getTotalToneladas() + " toneladas.");
						System.out.println("-> " + p.getMejorTrimestre());
						System.out.println("-> Subvención asignada: " + p.calcularSubvencion() + " € (Polimorfismo)");

						if (p instanceof ProductoIberico) {
							ProductoIberico ibe = (ProductoIberico) p;
							System.out.println(
									"-> Certificación: " + ibe.obtenerColorEtiqueta() + " (Uso de instanceof)");
						}
					}
				}

			} else if (opcion == 3) {
				System.out.print("Introduce el código del producto a buscar: ");
				String codBuscar = leer.nextLine();
				boolean encontrado = false;

				for (int i = 0; i < listaProductos.size(); i++) {
					ProductoExtremadura p = listaProductos.get(i);
					if (p.getCodigo().equalsIgnoreCase(codBuscar)) {
						System.out.println("--- PRODUCTO ENCONTRADO ---");
						System.out.println(p.toString());
						System.out.println("-> Subvención: " + p.calcularSubvencion() + " €");
						encontrado = true;
						break;
					}
				}
				if (!encontrado) {
					System.out.println("Producto no localizado");
				}

			} else if (opcion == 4) {
				System.out.print("Introduce el código del producto a modificar: ");
				String codModificar = leer.nextLine();
				boolean modificado = false;

				for (int i = 0; i < listaProductos.size(); i++) {
					ProductoExtremadura p = listaProductos.get(i);
					if (p.getCodigo().equalsIgnoreCase(codModificar)) {
						System.out.print("Introduce el nuevo precio base (€): ");
						double nuevoPrecio = leer.nextDouble();
						p.setPrecioKilo(nuevoPrecio);
						System.out.println("> Precio actualizado correctamente.");
						modificado = true;
						break;
					}
				}
				if (!modificado) {
					System.out.println("Producto no localizado");
				}

			} else if (opcion == 5) {
				System.out.print("Introduce el código del producto a dar de baja: ");
				String codBorrar = leer.nextLine();
				boolean eliminado = false;

				for (int i = 0; i < listaProductos.size(); i++) {
					if (listaProductos.get(i).getCodigo().equalsIgnoreCase(codBorrar)) {
						listaProductos.remove(i);
						System.out.println("> Producto eliminado del sistema con éxito.");
						eliminado = true;
						break;
					}
				}
				if (!eliminado) {
					System.out.println("Producto no localizado");
				}

			} else if (opcion == 6) {
				System.out.println("Saliendo de la plataforma CeresExt. ¡Hasta pronto!");

			} else {
				System.out.println("Opción incorrecta. Elige de 1 a 6.");
			}

		} while (opcion != 6);

		leer.close();
	}
}
