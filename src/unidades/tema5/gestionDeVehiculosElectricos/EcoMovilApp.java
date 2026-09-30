package unidades.tema5.gestionDeVehiculosElectricos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EcoMovilApp {

	public static void main(String[] args) {

		String marca, modelo;
		boolean pedales;
		int autonomia, potenciaMotor, numPlazas;
		int numCoches = 0;
		int numBicis = 0;
		int numPatinetes = 0;

		Scanner teclado = new Scanner(System.in);
		ArrayList<VehiculoElectrico> vehiculos = new ArrayList<>();

		int opcion;

		do {

			System.out.println("--------------MENU--------------");
			System.out.println("1.Agregar una bicicleta electrica");
			System.out.println("2.Agregar un patinete electrico");
			System.out.println("3.Agregar un coche electrico");
			System.out.println("4.Mostrar todos los vehiculos registrados");
			System.out.println("5.Cargar todos los vehiculos");
			System.out.println("6.Salir\n");

			System.out.println("Que quieres hacer");
			opcion = teclado.nextInt();
			teclado.nextLine();

			if (opcion == 1) {
				if (numBicis >= 5) {
					System.out.println("No puede introducir mas bicis");
				} else {

					System.out.println("Marca: ");
					marca = teclado.nextLine();
					System.out.println("Modelo: ");
					modelo = teclado.nextLine();
					System.out.println("Autonomia: ");
					autonomia = teclado.nextInt();
					teclado.nextLine();
					System.out.println("¿Tiene pedales?: ");
					pedales = teclado.nextBoolean();
					teclado.nextLine();
					BicicletaElectrica bici1 = new BicicletaElectrica(marca, modelo, autonomia, pedales);
					System.out.println("Bicicleta electrica agregada");
					vehiculos.add(bici1);
					numBicis++;

				}
			} else if (opcion == 2) {
				if (numPatinetes >= 5) {
					System.out.println("No puede introducir mas patinetes");
				} else {
					System.out.println("Marca: ");
					marca = teclado.nextLine();
					System.out.println("Modelo: ");
					modelo = teclado.nextLine();
					System.out.println("Autonomia: ");
					autonomia = teclado.nextInt();
					teclado.nextLine();
					System.out.println("Potencia motor: ");
					potenciaMotor = teclado.nextInt();
					teclado.nextLine();
					PatineteElectrico patinete1 = new PatineteElectrico(marca, modelo, autonomia, potenciaMotor);
					System.out.println("Patinete electrico agregado");
					vehiculos.add(patinete1);
					numPatinetes++;
				}
			} else if (opcion == 3) {
				if (numCoches >= 5) {
					System.out.println("No puede introducir mas coches");
				} else {

					System.out.println("Marca: ");
					marca = teclado.nextLine();
					System.out.println("Modelo: ");
					modelo = teclado.nextLine();
					System.out.println("Autonomia: ");
					autonomia = teclado.nextInt();
					teclado.nextLine();
					System.out.println("Numero de plazas: ");
					numPlazas = teclado.nextInt();
					teclado.nextLine();
					CocheElectrico coche1 = new CocheElectrico(marca, modelo, autonomia, numPlazas);
					System.out.println("Coche electrico agregado");
					vehiculos.add(coche1);
					numCoches++;

				}
			} else if (opcion == 4) {

				Iterator<VehiculoElectrico> iterator = vehiculos.iterator();

				while (iterator.hasNext()) {
					VehiculoElectrico vehiculo = iterator.next();

					if (vehiculo instanceof BicicletaElectrica) {
						System.out.println("Bicicleta electrica");
					} else if (vehiculo instanceof PatineteElectrico) {
						System.out.println("Patinete electrico");
					} else {
						System.out.println("Coche electrico");
					}

					vehiculo.mostrarInformacion();
				}

			} else if (opcion == 5) {

				Iterator<VehiculoElectrico> iterator = vehiculos.iterator();

				while (iterator.hasNext()) {
					VehiculoElectrico vehiculo = iterator.next();

					vehiculo.cargar();
				}

				/*
				 * for(int i =0;i<vehiculos.size();i++) { vehiculos.get(i).cargar(); }
				 */

			} else if (opcion == 6) {
				System.out.println("Saliendo del programa");
				break;
			} else {
				System.out.println("Numero incorrecto. Introduzca un numero de nuevo");
			}

		} while (opcion != 6);

	}

}
