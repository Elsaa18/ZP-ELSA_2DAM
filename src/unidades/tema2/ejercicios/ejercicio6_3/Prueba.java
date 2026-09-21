package unidades.tema2.ejercicios.ejercicio6_3;

public class Prueba {

	private int valor;
	
	public void cambiarValor(int x) {
		x=100;
	}
	
	public void cambiarNombre(Persona p) {
		p.setPersona("elsa");
		System.out.println(p.getPersona());
	}
}

