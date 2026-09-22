package unidades.tema4;

public class Vehiculo {
	
	private String marca;
	private int velocidadMaxima;
	private boolean enMarcha;
	
	public Vehiculo(String marca, int velocidadMaxima) {
		super();
		this.marca = marca;
		this.velocidadMaxima = velocidadMaxima;
		this.enMarcha = false;
	}
	
	public Vehiculo(String marca) {
		super();
		this.marca = marca;
		this.velocidadMaxima = 120;
		this.enMarcha = false;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public boolean isEnMarcha() {
		return enMarcha;
	}

	public void setEnMarcha(boolean enMarcha) {
		this.enMarcha = enMarcha;
	}
	
	public void arrancar() {
		setEnMarcha(true);
		System.out.println("El vehiculo a arrancado");
		
	}
	
	public void detener() {
		setEnMarcha(false);
		System.out.println("El vehiculo se a detenido");
	}
	
	public void mostrarDatos() {
		System.out.println("--- DATOS DEL VEHÍCULO ---");
		System.out.println("Marca: " + getMarca());
		System.out.println("Velocidad maxima: "+  getVelocidadMaxima());
		System.out.println("¿Vehiculo en marcha?: " + isEnMarcha());
	}
	
	public static Vehiculo vehiculoMasRapido(Vehiculo v1,Vehiculo v2) {
		if(v1.getVelocidadMaxima()>=v2.getVelocidadMaxima()) {
			return v1;
		}
		else if(v1.getVelocidadMaxima()<v2.getVelocidadMaxima()) {
			return v2;
		}
		return null;
	}

}
