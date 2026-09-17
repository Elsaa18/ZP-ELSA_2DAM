package unidades.tema2.ejercicios.ejercicio5_1;

public class MainCuentaBancaria {

	public static void main(String[] args) {

		CuentaBancaria c1 = new CuentaBancaria();
		
		c1.setSaldo(4324.5);
		System.out.println("saldo: "+ c1.getSaldo()+" -- IBAN: " + c1.getIBAN());
		
	}

}
