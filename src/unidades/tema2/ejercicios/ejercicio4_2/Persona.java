package unidades.tema2.ejercicios.ejercicio4_2;

public class Persona {
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public Persona() {
		this.nombre = "Desconocido";
		this.edad = 0;
	}
	private String nombre;
	private int edad;
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
