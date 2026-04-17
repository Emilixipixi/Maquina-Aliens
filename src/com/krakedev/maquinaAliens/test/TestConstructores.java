package com.krakedev.maquinaAliens.test;

import com.krakedev.maquinaAliens.Alien;

public class TestConstructores {

	public static void main(String[] args) {
		Alien alien1= new Alien (7,"red");
		Alien alien2= new Alien (2,"red");
		Alien alien3= new Alien (56,"red");
		Alien alien4= new Alien (19,"red");
		
		alien1.imprimir();
		alien2.imprimir();
		alien3.imprimir();
		alien4.imprimir();

	}

}
