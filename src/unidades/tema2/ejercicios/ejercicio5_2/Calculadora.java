package unidades.tema2.ejercicios.ejercicio5_2;

public class Calculadora {
	
	private int a;
	private int b;
	private int c;
	
	public void sumar() {
		int suma = a+b;
		System.out.println("SUMA-> "+suma);
	}

	public void restar() {
		int suma = a-b;
		System.out.println("RESTA-> "+suma);

	}
	public void promedio() {
	    
		int divisor=0;
		
		if (a != 0) {
			divisor++;
		}
	    if (b != 0) {
	    	divisor++;
	    }
	    if (c != 0) {
	    	divisor++;
	    }

	    if (divisor == 0) {
	        System.out.println("PROMEDIO-> 0");
	        return;
	    }

		int promedio = (a+b+c)/3;
		System.out.println("PROMEDIO-> "+promedio);

	}


}
