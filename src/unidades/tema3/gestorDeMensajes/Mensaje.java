package unidades.tema3.gestorDeMensajes;

public class Mensaje {

	private String autor;
	private String contenido;
	private int longitud;
	private int palabras;

	public Mensaje(String autor, String contenido) {
		super();
		this.autor = autor;
		this.contenido = contenido;
		this.longitud = calcularLongitud();
		this.palabras = contarPalabras();
	}

	public int calcularLongitud() {
		contenido = contenido.replaceAll(" ", "");
		int i;
		int longitud = 0;
		for (i = 0; i < contenido.length(); i++) {
			longitud++;
		}
		return longitud;
	}

	public int contarPalabras() {

	    String[] partes = contenido.trim().split(" +");

	    return partes.length;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getAutor() {
		return autor;
	}

	public int getLongitud() {
		return longitud;
	}

	public int getPalabras() {
		return palabras;
	}
	
	public void mostrar() {
		System.out.println("Autor: " + getAutor());
		System.out.println("Contenido: " + getContenido());
		System.out.println("Longitud: " + getLongitud());
		System.out.println("Palabras: " + getPalabras());
	}

}
