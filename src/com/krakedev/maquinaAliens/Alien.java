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


	public Alien(int tamanio, String color) {

	
		if (tamanio < 5) {
		    tamanio = 5;
		} else if (tamanio > 30) {
		    tamanio = 30;
		}

		this.tamanio = tamanio;
		this.color = color;

		this.precioCuerpo = this.tamanio * 0.20;
		this.precioExtremidad = this.tamanio * 0.10;
		this.precioOjo = this.tamanio * 0.05;
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
	
	public void imprimir() {
		
		
		System.out.println("Tamaño: "+ this.tamanio);
		System.out.println("Color: "+this.color);
		System.out.println("Numero de ojos: "+this.numeroOjos);
		System.out.println("Numero de brazos: "+this.numeroBrazos);
		System.out.println("Numero de pies: "+this.numeroPies);
		
	}
	
}