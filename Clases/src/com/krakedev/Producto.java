package com.krakedev;

public class Producto {
private String nombre;
private String descripcion;
private float precio;
private int stockActual;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public float getPrecio() {
	return precio;
}
public void setPrecio(float precio) {
	this.precio = precio;
}
public int getStockActual() {
	return stockActual;
}
public void setStockActual(int stockActual) {
	this.stockActual = stockActual;
}


}
