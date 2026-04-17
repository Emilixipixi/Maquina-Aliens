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

	private static final int TAMANIO_MINIMO = 5;
	private static final int TAMANIO_MAXIMO = 30;

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
}