package unidades.tema4;

public class Moto extends Vehiculo{

	private int cilindrada;
	private String tipo;
	
	
	public Moto(String marca, int velocidadMaxima, int cilindrada, String tipo) {
		super(marca, velocidadMaxima);
		this.cilindrada = cilindrada;
		this.tipo = tipo;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Cilindrada: " + getCilindrada());
		System.out.println("Tipo: "+ getTipo());
	}
	
	public void arrancar(boolean caballete) {
		if(caballete==true) {
			System.out.println("El vehiculo no a arrancado");
			System.out.println("Nose puede arrancar la moto con el caballete puesto");
		}
		else if(caballete==false) {
			super.arrancar();
			System.out.println("La moto ha arrancado correctamente");
		}
		
	}
	
}
