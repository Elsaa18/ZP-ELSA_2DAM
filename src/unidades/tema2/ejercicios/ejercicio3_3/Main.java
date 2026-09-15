package unidades.tema2.ejercicios.ejercicio3_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		int num1 = teclado.nextInt();
		
		System.out.println("Dime otro numero");
		int num2 = teclado.nextInt();
		
		System.out.println(Math.max(num1, num2));
		System.out.println(Math.min(num1, num2));
		System.out.println(Math.pow(num1, num2));
		
	}

}
