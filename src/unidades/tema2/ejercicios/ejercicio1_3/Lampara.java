package unidades.tema2.ejercicios.ejercicio1_3;

public class Lampara {

	private boolean encendida;
	
	public void encender() {
		encendida=true;
		System.out.println("Lampara encendidad: "+ encendida);
	}
	
	public void apagar() {
		encendida=false;
		System.out.println("Lampara encendidad: "+ encendida);
	}
	
	
}
