package unidades.tema5.gestionDeVehiculosElectricos;

public class PatineteElectrico extends VehiculoElectrico {
	private int potenciaMotor;

	public PatineteElectrico(String marca, String modelo, int autonomia, int potenciaMotor) {
		super(marca, modelo, autonomia);
		this.potenciaMotor = potenciaMotor;
	}

	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Potencia motor: " + potenciaMotor);
	}

	@Override
	public void cargar() {
		System.out.println("Cargando patinete electrico...");
	}

}