package unidades.tema2.pruebaDeEvaluacion;

public class Libreria {
	
	private String nombre;
	private Libro libroDestacado;
	
	public Libreria(String nombre, Libro libroDestacado) {
		super();
		this.nombre = nombre;
		this.libroDestacado = libroDestacado;
	}
	
	public void mostrarLireria() {
        System.out.println("Libro destacado: " + libroDestacado.getTitulo());
        System.out.println("Autor: " + libroDestacado.getAutor());
        System.out.println("Precio final: " + libroDestacado.getPrecio() + " €");
	}
	

}
