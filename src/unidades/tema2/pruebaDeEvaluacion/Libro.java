package unidades.tema2.pruebaDeEvaluacion;

public class Libro {
	
	private String titulo;
	private String autor;
	private double precio;
	private String comentario;
	private int isbn;
	public Libro() {
		double numRandom =  Math.random()*1000000;
		int numIsbn = (int) numRandom;

		this.titulo = "Sin titulo";
		this.autor = "Anonimo";
		this.precio = 0.0;
		this.comentario = "Sin comentario";
		this.isbn = numIsbn;
	}
	
	public Libro(String titulo, String autor, double precio, String comentario) {
		double numRandom =  Math.random()*1000000;
		int numIsbn = (int) numRandom;

		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.comentario = comentario;
		this.isbn = numIsbn;
	}
	
	public void procesarComentario() {
		comentario = comentario.trim();
		comentario = comentario.toUpperCase();
		System.out.println("Comentario procesado: " + comentario);
		System.out.println("Longitud comentario: "+comentario.length());

	}
	
	public void mostrarInfo() {
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(precio);
		procesarComentario();
		System.out.println(comentario);
		System.out.println(isbn);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public int getIsbn() {
	    return isbn;
	}
	

}
