package unidades.tema4;

public class Coche extends Vehiculo{

	private int numPuertas;
	private boolean automatico;
	
	public Coche(String marca, int velocidadMaxima, int numPuertas, boolean automatico) {
		super(marca, velocidadMaxima);
		this.numPuertas = numPuertas;
		this.automatico = automatico;
	}
	
	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public boolean isAutomatico() {
		return automatico;
	}

	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}

	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Numero de puertas: "+ getNumPuertas());
		System.out.println("¿Es automatico?: "+ isAutomatico());
	}
	
	public void arrancar(String modo) {
		super.arrancar();
		if(modo.equalsIgnoreCase("llave")) {
			System.out.println("Arrancando el coche con llave");
		}
		else if(modo.equalsIgnoreCase("boton")) {
			System.out.println("Arrancando el coche con botón");
		}
		else {
			System.out.println("ERROR: No has introducido correctamente el modo");
		}
	}

}
