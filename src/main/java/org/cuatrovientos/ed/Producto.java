package org.cuatrovientos.ed;

public class Producto {
	
	String nombre;
	float precio;
	int cantidad;
	
	Producto(String nombre, float precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public float precioTotal() {
		return this.precio * this.cantidad;
	}
	
	public String toString() {
		return "Nombre: " + nombre + "precio: " + precio + "cantidad: " + cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
