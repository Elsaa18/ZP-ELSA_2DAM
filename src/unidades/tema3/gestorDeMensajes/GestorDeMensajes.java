package unidades.tema3.gestorDeMensajes;

import java.util.Scanner;

public class GestorDeMensajes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		
		//Mensaje 1
		System.out.println("Mensaje 1");
		String autor="";
		do {
			System.out.println("Introduce el autor del mensaje");
			autor= teclado.nextLine();
			if(autor.equals("")) {
				System.out.println("El autor no puede estar vacio.Introduzca de nuevo el autor");
			}
			
		}while(autor.equals(""));
		
		String contenido="";
		do {
			System.out.println("Introduce el contenido del mensaje");
			contenido= teclado.nextLine();
			if(contenido.length()<5||contenido.length()>200) {
				System.out.println("El contenido no puede ser menor a 5 o meyor a 200 de longitud");
			}
			
		}while(contenido.length()<5||contenido.length()>200);
		
		Mensaje mensaje1 = new Mensaje(autor, contenido);
		System.out.println("Mensaje cargado correctamente");
		System.out.println("Longitud sin espacios: "+mensaje1.calcularLongitud());
		System.out.println("Palabras: " + mensaje1.contarPalabras());
		
		//Mensaje 2
		System.out.println("Mensaje 1");
		String autor2="";
		do {
			System.out.println("Introduce el autor del mensaje");
			autor2= teclado.nextLine();
			if(autor2.equals("")) {
				System.out.println("El autor no puede estar vacio.Introduzca de nuevo el autor");
			}
			
		}while(autor2.equals(""));
		
		String contenido2="";
		do {
			System.out.println("Introduce el contenido del mensaje");
			contenido2= teclado.nextLine();
			if(contenido2.length()<5||contenido2.length()>200) {
				System.out.println("El contenido no puede ser menor a 5 o meyor a 200 de longitud");
			}
			
		}while(contenido2.length()<5||contenido2.length()>200);
		
		Mensaje mensaje2 = new Mensaje(autor2, contenido2);
		System.out.println("Mensaje cargado correctamente");
		System.out.println("Longitud sin espacios: "+mensaje2.calcularLongitud());
		System.out.println("Palabras: " + mensaje2.contarPalabras());
		
		//Mensaje 3
		System.out.println("Mensaje 1");
		String autor3="";
		do {
			System.out.println("Introduce el autor del mensaje");
			autor3= teclado.nextLine();
			if(autor3.equals("")) {
				System.out.println("El autor no puede estar vacio.Introduzca de nuevo el autor");
			}
			
		}while(autor3.equals(""));
		
		String contenido3="";
		do {
			System.out.println("Introduce el contenido del mensaje");
			contenido3= teclado.nextLine();
			if(contenido3.length()<5||contenido3.length()>200) {
				System.out.println("El contenido no puede ser menor a 5 o meyor a 200 de longitud");
			}
			
		}while(contenido3.length()<5||contenido3.length()>200);
		
		Mensaje mensaje3 = new Mensaje(autor3, contenido3);
		System.out.println("Mensaje cargado correctamente");
		System.out.println("Longitud sin espacios: "+mensaje3.calcularLongitud());
		System.out.println("Palabras: " + mensaje3.contarPalabras());
		

	}
	public void Menu() {
		Scanner teclado = new Scanner(System.in);
		int opcion=0;
		do {
		System.out.println("Elige una opcion: ");
		opcion = teclado.nextInt();
		
		System.out.println("1. Mostrar los mensajes registrados");
		System.out.println("2. Mostrar el mensaje más largo (comparando longitud calculada)");
		System.out.println("3. Contar cuántas veces aparece una letra en un mensaje");
		System.out.println("4. Crear una versión invertida del contenido (mediante bucle)");
		System.out.println("5. Convertir un mensaje a \"Formateado Título\" (cada palabra inicia en mayúscula)");
		System.out.println("6. Salir");
		}while(opcion!=6);
		
	}
}
