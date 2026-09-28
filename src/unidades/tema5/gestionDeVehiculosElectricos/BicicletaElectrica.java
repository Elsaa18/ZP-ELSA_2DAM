package unidades.tema5.gestionDeVehiculosElectricos;

public class BicicletaElectrica extends VehiculoElectrico{

	private boolean tienePedales;

	public BicicletaElectrica(String marca, String modelo, int autonomia, boolean tienePedales) {
		super(marca, modelo, autonomia);
		this.tienePedales = tienePedales;
	}
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("¿Tiene pedales? "+tienePedales);
	}
	
	@Override
	public void cargar() {
		System.out.println("Cargando bicicleta electrica...");
	}
}
