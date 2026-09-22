package unidades.tema4;

public class Main {

	public static void main(String[] args) {

		Vehiculo v1 = new Vehiculo("Seat", 120);
		Vehiculo v2 = new Vehiculo("Mercedes");
		Coche c1 = new Coche("BMW", 120, 4, false);
		Moto m1 = new Moto("Yamaha", 150, 45, "automatico");
		
		
		System.out.println("Vehiculo 1");
		System.out.println("Velocidad maxima: "+v1.getVelocidadMaxima());
		v1.setVelocidadMaxima(100);
		System.out.println("Velocidad maxima: "+v1.getVelocidadMaxima()+"\n");	
		
		System.out.println("Vehiculo 2");
		System.out.println("Marca: "+v2.getMarca());	
		v2.setMarca("Citroen");
		System.out.println("Marca: "+v2.getMarca()+"\n");	

		
		System.out.println("Coche 1");
		System.out.println("¿Es automatico?: "+ c1.isAutomatico());
		c1.setAutomatico(true);
		System.out.println("¿Es automatico?: "+ c1.isAutomatico()+"\n");
		
		System.out.println("Moto 1");
		System.out.println("Cilindrada: " + m1.getCilindrada());
		m1.setCilindrada(80);
		System.out.println("Cilindrada: " + m1.getCilindrada()+"\n");
		
		
		v1.mostrarDatos();
		System.out.println();

		v2.mostrarDatos();
		System.out.println();

		c1.mostrarDatos();
		System.out.println();

		m1.mostrarDatos();
		System.out.println();

		
		v2.arrancar();
		System.out.println();
		
		c1.arrancar("llave");
		System.out.println();
		
		m1.arrancar(true);
		System.out.println();
		
		m1.arrancar(false);
		System.out.println();
		
		
		Vehiculo masRapido = Vehiculo.vehiculoMasRapido(c1, m1);
		System.out.println("El mas rapido es: ");
		masRapido.mostrarDatos();
	}

}
