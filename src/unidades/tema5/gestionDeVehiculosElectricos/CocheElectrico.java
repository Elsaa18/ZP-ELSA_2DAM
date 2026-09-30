package unidades.tema5.gestionDeVehiculosElectricos;

public class CocheElectrico extends VehiculoElectrico{
	private int numeroPlazas;

	public CocheElectrico(String marca, String modelo, int autonomia, int numeroPlazas) {
		super(marca, modelo, autonomia);
		this.numeroPlazas = numeroPlazas;
	}

	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Numero de plazas: " + numeroPlazas);
	}

	@Override
	public void cargar() {
		System.out.println("Cargando coche electrico...");
	}

}
