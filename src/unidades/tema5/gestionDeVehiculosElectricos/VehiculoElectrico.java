package unidades.tema5.gestionDeVehiculosElectricos;

public class VehiculoElectrico {

	private String marca;
	private String modelo;
	private int autonomia;
	public VehiculoElectrico(String marca, String modelo, int autonomia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.autonomia = autonomia;
	}
	
	public void mostrarInformacion() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Autonomia: " + autonomia);
	}

	public void cargar() {
		System.out.println("Cargando vehiculo electrica...");
	}
	
	
}
