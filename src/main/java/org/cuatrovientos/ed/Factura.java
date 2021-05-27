package org.cuatrovientos.ed;

import java.util.ArrayList;

public class Factura {
	
	ArrayList<Producto> productos;
	
	Factura() {
		productos = new ArrayList<Producto>();
	}
	public void meterProducto(Producto p) {
		productos.add(p);
	}
	
	public float totalFactura() {
		float precioTotalfactura = 0f;
		for (Producto producto : productos) {
			precioTotalfactura += producto.precioTotal();
		}
		return precioTotalfactura;
	}
	
	public float aplicarIva(float iva) {
		return totalFactura() * (1 + iva);
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	

}
