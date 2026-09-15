package unidades.tema2.ejercicios.ejercicio1_2;

public class Coche {

	private String marca;
	private int velocidad;

	public int acelerar(int cantidad) {
		velocidad=velocidad+cantidad;
		return velocidad;
	}
	public void mostrarVelocidad() {
		System.out.println("Velocidad actual:" + velocidad);
	}
}
