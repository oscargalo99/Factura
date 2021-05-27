package org.cuatrovientos.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	Producto p;
	Factura f;

	@BeforeEach
	void setUp() throws Exception {
		p  = new Producto("pan", 0.5f, 1);
		f = new Factura();
	}

	@Test
	void testProducto() {
		String expected = "pan 0.5 1";
		String actual = p.getNombre() + " " + p.getPrecio() + " " + p.getCantidad();
		assertEquals(expected, actual, "Adding values");
	}
	
	@Test
	void testPrecioTotal() {
		double expected = 0.5;
		double actual = p.getCantidad() * p.getPrecio();
		assertEquals(expected, actual, "Adding values");
	}
	
	@Test
	void testTotalFactura() {
		Producto manzana = new Producto("manzana",5f,3);
		Producto pera = new Producto("pera", 3f, 4);
		Producto platano = new Producto("platano", 1f, 10);
		f.meterProducto(manzana);
		f.meterProducto(pera);
		f.meterProducto(platano);
		float actual = f.totalFactura();
		float expected = 37f;
		assertEquals(expected, actual, 0.5f);
	}

	@Test
	void testAplicarIva() {
		Producto manzana = new Producto("manzana",5f,3);
		Producto pera = new Producto("pera", 3f, 4);
		Producto platano = new Producto("platano", 1f, 10);
		f.meterProducto(manzana);
		f.meterProducto(pera);
		f.meterProducto(platano);
		float expected = f.aplicarIva(0.21f);
		float actual = 44.77f;
		assertEquals(expected, actual, "Adding values");
	}
}
