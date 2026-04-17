package com.krakedev.maquinaAliens.test.JUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.maquinaAliens.Alien;

class TestJUnit {
	
	@Test
	void testCrearAlienNormal() {
		
		Alien alien=new Alien (3,"rojo");
		
		assertEquals(alien.getTamanio(),5);
		assertEquals("rojo",alien.getColor());
		assertEquals(1.0,alien.getPrecioCuerpo());
		assertEquals(0.5,alien.getPrecioExtremidad());
		assertEquals(0.25,alien.getPrecioOjo());
			}

}
