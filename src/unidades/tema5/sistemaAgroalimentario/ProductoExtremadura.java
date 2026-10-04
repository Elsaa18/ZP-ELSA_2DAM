package unidades.tema5.sistemaAgroalimentario;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

abstract class ProductoExtremadura {
	private String codigo;
	private String denominacion;
	private double precioKilo;
	private double[] producciones;

	public ProductoExtremadura(String denominacion, double precioKilo, double[] producciones) {
		this.denominacion = denominacion;
		this.precioKilo = precioKilo;
		this.producciones = producciones;
		this.codigo = generarCodigo();
	}

	private String generarCodigo() {
		String tresLetras = "";
		if (this.denominacion.length() < 3) {
			tresLetras = this.denominacion;
			while (tresLetras.length() < 3) {
				tresLetras += "Z";
			}
		} else {
			tresLetras = this.denominacion.substring(0, 3);
		}
		tresLetras = tresLetras.toUpperCase();

		int aleatorio = (int) (Math.random() * (5000 - 500 + 1)) + 500;
		int longitudNombre = this.denominacion.length();

		return tresLetras + "_" + aleatorio + "_" + longitudNombre;
	}

	public double getTotalToneladas() {
		double total = 0;
		for (int i = 0; i < producciones.length; i++) {
			total += producciones[i];
		}
		return total;
	}

	public String getMejorTrimestre() {
		double maximo = producciones[0];
		int indiceMejor = 0;
		for (int i = 1; i < producciones.length; i++) {
			double antiguoMaximo = maximo;
			maximo = Math.max(maximo, producciones[i]);
			if (maximo != antiguoMaximo) {
				indiceMejor = i;
			}
		}
		return "El trimestre estrella es el " + (indiceMejor + 1) + " con " + maximo + " toneladas.";
	}

	public abstract double calcularSubvencion();

	public String getCodigo() {
		return codigo;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public double getPrecioKilo() {
		return precioKilo;
	}

	public void setPrecioKilo(double precioKilo) {
		this.precioKilo = precioKilo;
	}

	public double[] getProducciones() {
		return producciones;
	}

	@Override
	public String toString() {
		return "[Código: " + codigo + "] " + denominacion + " - " + precioKilo + " €/kg";
	}
}
