package com.cmc.repaso.entidades;

public class Item {
private String nombre;
private int productoActuales;
private int productosDevueltos;
private int productosVendidos;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getProductoActuales() {
	return productoActuales;
}
public void setProductoActuales(int productoActuales) {
	this.productoActuales = productoActuales;
}
public int getProductosDevueltos() {
	return productosDevueltos;
}
public void setProductosDevueltos(int productosDevueltos) {
	this.productosDevueltos = productosDevueltos;
}
public int getProductosVendidos() {
	return productosVendidos;
}
public void setProductosVendidos(int productosVendidos) {
	this.productosVendidos = productosVendidos;
}

public void imprimir() {
	System.out.println("Productos actuales "+getProductoActuales());
	System.out.println("Productos devueltos "+ getProductosDevueltos());
	System.out.println("Productos vendidos "+ getProductosVendidos());
	
}

public void vender(int productoVendidos) {
	setProductoActuales(getProductoActuales()-productoVendidos);
	setProductosVendidos(getProductosVendidos()+productoVendidos);
}
public void devolver(int productoVendidos) {
	setProductosVendidos(getProductosVendidos()-productoVendidos);
	setProductoActuales(getProductoActuales()+productoVendidos);

	setProductosDevueltos(getProductosDevueltos()+productoVendidos);
}
}
