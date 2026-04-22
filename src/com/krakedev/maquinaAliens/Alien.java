package com.krakedev.maquinaAliens;

public class Alien {

	
	private int tamanio;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;
	private double precioTotal; 

	
	public Alien(int tamanio, String color) {

		// Validación de rango: mínimo 5 cm, máximo 30 cm
		if (tamanio < 5) {
			tamanio = 5;
		} else if (tamanio > 30) {
			tamanio = 30;
		}

		this.tamanio = tamanio;
		this.color = color;

		// Cálculo automático de precios base
		this.precioCuerpo = this.tamanio * 0.20;
		this.precioExtremidad = this.tamanio * 0.10;
		this.precioOjo = this.tamanio * 0.05;

		// Precio total parte del precio del cuerpo
		this.precioTotal = this.precioCuerpo;
	}

	
	public int getTamanio() {
		return tamanio;
	}

	public String getColor() {
		return color;
	}

	public int getNumeroOjos() {
		return numeroOjos;
	}

	public int getNumeroBrazos() {
		return numeroBrazos;
	}

	public int getNumeroPies() {
		return numeroPies;
	}

	public double getPrecioExtremidad() {
		return precioExtremidad;
	}

	public double getPrecioOjo() {
		return precioOjo;
	}

	public double getPrecioCuerpo() {
		return precioCuerpo;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	
	
	
	public boolean agregarBrazos(int cantidad) {
		int totalActual = this.numeroBrazos + this.numeroPies;
		if (totalActual + cantidad > 10) {
			return false;
		}
		this.numeroBrazos += cantidad;
		calcularPrecioTotal(); 
		return true;
	}

	
	public boolean agregarPiernas(int cantidad) {
		int totalActual = this.numeroBrazos + this.numeroPies;
		if (totalActual + cantidad > 10) {
			return false;
		}
		this.numeroPies += cantidad;
		calcularPrecioTotal(); 
		return true;
	}

	
	public boolean agregarOjos(int cantidad) {
		int maxOjos = obtenerMaximoOjos();
		if (this.numeroOjos + cantidad > maxOjos) {
			return false;
		}
		this.numeroOjos += cantidad;
		calcularPrecioTotal();
		return true;
	}

	
	private int obtenerMaximoOjos() {
		if (tamanio <= 10) {
			return 3;
		} else if (tamanio <= 20) {
			return 5;
		} else {
			return 7;
		}
	}

	
	public void calcularPrecioTotal() {
		int totalExtremidades = this.numeroBrazos + this.numeroPies;
		this.precioTotal = this.precioCuerpo + (totalExtremidades * this.precioExtremidad)
				+ (this.numeroOjos * this.precioOjo);
	}

	
	public void imprimir() {
		System.out.println("========================================");
		System.out.println("Tamaño          : " + this.tamanio + " cm");
		System.out.println("Color           : " + this.color);
		System.out.println("Número de ojos  : " + this.numeroOjos);
		System.out.println("Número de brazos: " + this.numeroBrazos);
		System.out.println("Número de pies  : " + this.numeroPies);
		System.out.printf("Precio cuerpo   : $%.2f%n", this.precioCuerpo);
		System.out.printf("Precio extremid.: $%.2f%n", this.precioExtremidad);
		System.out.printf("Precio ojo      : $%.2f%n", this.precioOjo);
		System.out.printf("PRECIO TOTAL    : $%.2f%n", this.precioTotal);
		System.out.println("========================================");
	}
}