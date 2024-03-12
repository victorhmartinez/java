package com.clearminds.componentes;

public class Producto {
private String nombre;
private double precio;
private String codigo;
public Producto(String nombre, String codigo,double precio) {
	
	this.nombre = nombre;
	this.precio = precio;
	this.codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public void incrementarPrecio(int porcentajeIncremento) {
	double  valorIncrementar= (getPrecio()*porcentajeIncremento)/100;
	setPrecio(getPrecio()+valorIncrementar);
}
public void disminuirPrecio(double valorDescuento) {
	setPrecio(getPrecio()-valorDescuento);
}
}
