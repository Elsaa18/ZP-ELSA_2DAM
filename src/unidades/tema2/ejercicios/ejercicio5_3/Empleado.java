package unidades.tema2.ejercicios.ejercicio5_3;

public class Empleado {
	private String nombre;
	private double salario=300;
	
	public void aumentarSalario(double porcentaje) {
		salario = salario * (1+(porcentaje/100));
	}

	public void mostrarInfo() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Salario: " + salario);
	}
}
