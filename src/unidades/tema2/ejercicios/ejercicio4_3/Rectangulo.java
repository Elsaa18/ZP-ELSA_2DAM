package unidades.tema2.ejercicios.ejercicio4_3;

public class Rectangulo {
	

	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public Rectangulo() {
		super();
		this.base = 1;
		this.altura =1 ;
	}
	
	public void calcularArea() {
		double area = base*altura;
		System.out.printf("Area %.2f",area);
		System.out.println();
	}
}
