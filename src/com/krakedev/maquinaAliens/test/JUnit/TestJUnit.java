package com.krakedev.maquinaAliens.test.JUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.krakedev.maquinaAliens.Alien;

class TestJUnit {

	@Test
	void testTamanioMenorAlMinimoSeAjustaA5() {
		Alien alien = new Alien(3, "rojo");
		assertEquals(5, alien.getTamanio());
	}

	@Test
	void testTamanioMayorAlMaximoSeAjustaA30() {
		Alien alien = new Alien(99, "azul");
		assertEquals(30, alien.getTamanio());
	}

	@Test
	void testTamanioEnRangoNoSeModifica() {
		Alien alien = new Alien(15, "verde");
		assertEquals(15, alien.getTamanio());
	}

	@Test
	void testTamanioExactoMinimo() {
		Alien alien = new Alien(5, "blanco");
		assertEquals(5, alien.getTamanio());
	}

	@Test
	void testTamanioExactoMaximo() {
		Alien alien = new Alien(30, "negro");
		assertEquals(30, alien.getTamanio());
	}

	@Test
	void testColorAsignadoCorrectamente() {
		Alien alien = new Alien(10, "morado");
		assertEquals("morado", alien.getColor());
	}

	@Test
	void testPreciosBaseConTamanio5() {
		Alien alien = new Alien(3, "rojo");
		assertEquals(1.00, alien.getPrecioCuerpo(), 0.001);
		assertEquals(0.50, alien.getPrecioExtremidad(), 0.001);
		assertEquals(0.25, alien.getPrecioOjo(), 0.001);
	}

	@Test
	void testPreciosBaseConTamanio30() {
		Alien alien = new Alien(30, "rojo");
		assertEquals(6.00, alien.getPrecioCuerpo(), 0.001);
		assertEquals(3.00, alien.getPrecioExtremidad(), 0.001);
		assertEquals(1.50, alien.getPrecioOjo(), 0.001);
	}

	@Test
	void testPreciosBaseConTamanio20() {
		Alien alien = new Alien(20, "azul");
		assertEquals(4.00, alien.getPrecioCuerpo(), 0.001);
		assertEquals(2.00, alien.getPrecioExtremidad(), 0.001);
		assertEquals(1.00, alien.getPrecioOjo(), 0.001);
	}

	@Test
	void testAgregarBrazosValido() {
		Alien alien = new Alien(10, "rojo");
		assertTrue(alien.agregarBrazos(5));
		assertEquals(5, alien.getNumeroBrazos());
	}

	@Test
	void testAgregarPiernasValido() {
		Alien alien = new Alien(10, "rojo");
		assertTrue(alien.agregarPiernas(4));
		assertEquals(4, alien.getNumeroPies());
	}

	@Test
	void testAgregarBrazosExcedeLimite() {
		Alien alien = new Alien(10, "rojo");
		assertFalse(alien.agregarBrazos(11));
		assertEquals(0, alien.getNumeroBrazos());
	}

	@Test
	void testAgregarBrazosEnLimiteExacto() {
		Alien alien = new Alien(10, "rojo");
		assertTrue(alien.agregarBrazos(10));
		assertEquals(10, alien.getNumeroBrazos());
	}

	@Test
	void testCombinacionBrazosPiernas_dentroDeLimite() {
		Alien alien = new Alien(10, "verde");
		assertTrue(alien.agregarBrazos(5));
		assertTrue(alien.agregarPiernas(5));
		assertEquals(5, alien.getNumeroBrazos());
		assertEquals(5, alien.getNumeroPies());
	}

	@Test
	void testCombinacionBrazosPiernas_excedeLimite() {
		Alien alien = new Alien(10, "verde");
		assertTrue(alien.agregarBrazos(6));
		assertFalse(alien.agregarPiernas(5));
		assertEquals(0, alien.getNumeroPies());
	}

	@Test
	void testAgregarBrazosEnLimiteExactoConPiernasExistentes() {
		Alien alien = new Alien(10, "azul");
		alien.agregarPiernas(4);
		assertTrue(alien.agregarBrazos(6));
		assertFalse(alien.agregarBrazos(1));
	}

	@Test
	void testAgregarOjosTamanio5A10_dentro() {
		Alien alien = new Alien(8, "rojo");
		assertTrue(alien.agregarOjos(3));
		assertEquals(3, alien.getNumeroOjos());
	}

	@Test
	void testAgregarOjosTamanio5A10_excede() {
		Alien alien = new Alien(8, "rojo");
		assertFalse(alien.agregarOjos(4));
		assertEquals(0, alien.getNumeroOjos());
	}

	@Test
	void testAgregarOjosTamanio10A20_dentro() {
		Alien alien = new Alien(15, "azul");
		assertTrue(alien.agregarOjos(5));
		assertEquals(5, alien.getNumeroOjos());
	}

	@Test
	void testAgregarOjosTamanio10A20_excede() {
		Alien alien = new Alien(15, "azul");
		assertFalse(alien.agregarOjos(6));
	}

	@Test
	void testAgregarOjosTamanio20A30_dentro() {
		Alien alien = new Alien(25, "verde");
		assertTrue(alien.agregarOjos(7));
		assertEquals(7, alien.getNumeroOjos());
	}

	@Test
	void testAgregarOjosTamanio20A30_excede() {
		Alien alien = new Alien(25, "verde");
		assertFalse(alien.agregarOjos(8));
	}

	@Test
	void testAgregarOjosAcumulado_excede() {
		Alien alien = new Alien(10, "amarillo");
		assertTrue(alien.agregarOjos(2));
		assertFalse(alien.agregarOjos(2));
		assertEquals(2, alien.getNumeroOjos());
	}

	@Test
	void testAgregarOjosTamanioExacto10() {
		Alien alien = new Alien(10, "rojo");
		assertTrue(alien.agregarOjos(3));
		assertFalse(alien.agregarOjos(1));
	}

	@Test
	void testAgregarOjosTamanioExacto20() {
		Alien alien = new Alien(20, "azul");
		assertTrue(alien.agregarOjos(5));
		assertFalse(alien.agregarOjos(1));
	}

	@Test
	void testPrecioTotalInicialIgualPrecioCuerpo() {
		Alien alien = new Alien(10, "rojo");
		assertEquals(alien.getPrecioCuerpo(), alien.getPrecioTotal(), 0.001);
	}

	@Test
	void testPrecioTotalConBrazos() {
		Alien alien = new Alien(10, "rojo");
		alien.agregarBrazos(3);
		assertEquals(5.0, alien.getPrecioTotal(), 0.001);
	}

	@Test
	void testPrecioTotalConPiernas() {
		Alien alien = new Alien(10, "rojo");
		alien.agregarPiernas(2);
		assertEquals(4.0, alien.getPrecioTotal(), 0.001);
	}

	@Test
	void testPrecioTotalConOjos() {
		Alien alien = new Alien(10, "rojo");
		alien.agregarOjos(2);
		assertEquals(3.0, alien.getPrecioTotal(), 0.001);
	}

	@Test
	void testPrecioTotalCompleto() {
		Alien alien = new Alien(20, "verde");
		alien.agregarBrazos(2);
		alien.agregarPiernas(3);
		alien.agregarOjos(4);
		assertEquals(18.0, alien.getPrecioTotal(), 0.001);
	}

	@Test
	void testPrecioTotalNoSumaElementosRechazados() {
		Alien alien = new Alien(8, "rojo");
		alien.agregarOjos(2);
		double precioAntes = alien.getPrecioTotal();
		alien.agregarOjos(5);
		assertEquals(precioAntes, alien.getPrecioTotal(), 0.001);
	}

	@Test
	void testPrecioTotalExtremidadesRechazadasNoSuman() {
		Alien alien = new Alien(10, "azul");
		alien.agregarBrazos(8);
		double precioAntes = alien.getPrecioTotal();
		alien.agregarPiernas(5);
		assertEquals(precioAntes, alien.getPrecioTotal(), 0.001);
	}
}