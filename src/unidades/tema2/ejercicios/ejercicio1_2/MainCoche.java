package unidades.tema2.ejercicios.ejercicio1_2;

public class MainCoche {

	public static void main(String[] args) {

		Coche coche = new Coche();
		
		int velocidad;
		velocidad=coche.acelerar(30);
		System.out.println(velocidad);
		
		velocidad=coche.acelerar(323);
		System.out.println(velocidad);
	}

}
