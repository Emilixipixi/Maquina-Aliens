package com.krakedev.maquinaAliens.test;

import com.krakedev.maquinaAliens.Alien;

public class TestConstructores {

	public static void main(String[] args) {

		System.out.println("Alien normal");
		Alien alien1 = new Alien(7, "red");
		alien1.imprimir();

		System.out.println("Alien tamaño 2");
		Alien alien2 = new Alien(2, "blue");
		alien2.imprimir();

		System.out.println(" Alien tamaño 56 ");
		Alien alien3 = new Alien(56, "green");
		alien3.imprimir();

		System.out.println("Alien en tamaño 30");
		Alien alien4 = new Alien(30, "yellow");
		alien4.imprimir();

		System.out.println("Alien tamaño 19 — agrega brazos y piernas");
		Alien alien5 = new Alien(19, "purple");
		System.out.println("Agregar 4 brazos  : " + alien5.agregarBrazos(4));
		System.out.println("Agregar 3 piernas : " + alien5.agregarPiernas(3));
		System.out.println("Agregar 4 piernas más (excede límite): " + alien5.agregarPiernas(4));
		System.out.println("Agregar 3 ojos    : " + alien5.agregarOjos(3));
		alien5.imprimir();

		System.out.println("Alien tamaño 25 — agrega ojos ");
		Alien alien6 = new Alien(25, "orange");
		System.out.println("Agregar 5 ojos    : " + alien6.agregarOjos(5));
		System.out.println("Agregar 3 ojos más (excede límite): " + alien6.agregarOjos(3));
		alien6.imprimir();
	}
}