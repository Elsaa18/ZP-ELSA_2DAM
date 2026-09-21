package unidades.tema2.pruebaDeEvaluacion;

public class Descuento {
	public static double calcularPrecioConDescuento(double precio, double porcentaje) {
		double precioDescont = precio * (1-(porcentaje/100));
		double precioRedond = Math.round(precioDescont);
		return precioRedond;
		
	}

}
