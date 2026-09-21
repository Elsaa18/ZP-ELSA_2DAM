package unidades.tema3.gestorDeTareas;

public class Tarea {

	private String nombre;
	private int prioridad;
	private String categoria;
	private double duracionHoras;
	
	public Tarea(String nombre, String categoria, double duracionHoras) {
		super();
		this.nombre = nombre;
		this.prioridad = generarNumero();;
		this.categoria = categoria;
		this.duracionHoras = 0;
	}
	
	public int generarNumero() {
		return 0;
	}

	public double getDuracionHoras() {
		return duracionHoras;
	}

	public void setDuracionHoras(double duracionHoras) {
		this.duracionHoras = duracionHoras;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public String getCategoria() {
		return categoria;
	}
	
	public void mostrar() {
		System.out.println("----------------------");
		System.out.println("Nombre: " + getNombre());
		System.out.println("Prioridad: " + getPrioridad());
		System.out.println("Categoria: " + getCategoria());
		System.out.println("Duracion horas: " + getDuracionHoras());
	}
	
}
