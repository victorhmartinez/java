package com.krakedev.persistencia.entidades;

public class Profesor {
private int codigo;
private String nombre;
public int getCodigo() {
	return codigo;
}

public Profesor(int codigo, String nombre) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}



}
