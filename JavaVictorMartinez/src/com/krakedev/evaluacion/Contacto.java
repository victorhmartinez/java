package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
private String cedula;
private String nombre;
private String apellido;
private Direccion direccion;
private ArrayList<Telefono>telefenos;


public Contacto(String cedula, String nombre, String apellido) {
	
	this.cedula = cedula;
	this.nombre = nombre;
	this.apellido = apellido;
	this.telefenos=new  ArrayList<Telefono>();
}
public String getCedula() {
	return cedula;
}
public void setCedula(String cedula) {
	this.cedula = cedula;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public Direccion getDireccion() {
	return direccion;
}
public void setDireccion(Direccion direccion) {
	this.direccion = direccion;
}

public ArrayList<Telefono> getTelefenos() {
	return telefenos;
}
public void setTelefenos(ArrayList<Telefono> telefenos) {
	this.telefenos = telefenos;
}
/*
public void imprimir() {
	System.out.println("Información del contacto : \n"+
			"Cedula: "+getCedula()+"\n"+
			"Nombre:"+getNombre()+"\n"+
			"Apellido: "+getApellido()+"\n"+
			"Direccion:"+"\n"+
			"	Calle Principal:"+getDireccion().getCallePrincipal()+"\n"+
			"	Calle Secundaria:"+getDireccion().getCalleSecundaria()+"\n");
}*/
public void imprimir() {
	if(getDireccion()!=null) {
		System.out.println("Información del contacto : \n"+
				"Cedula: "+getCedula()+"\n"+
				"Nombre:"+getNombre()+"\n"+
				"Apellido: "+getApellido()+"\n"+
				"Direccion:"+"\n"+
				"	Calle Principal:"+getDireccion().getCallePrincipal()+"\n"+
				"	Calle Secundaria:"+getDireccion().getCalleSecundaria()+"\n");
		
		/**
		 * System.out.println("***"+getNombre()+" "+getApellido()+"***"+"\n"+
		 
				"Direccion:"+getDireccion().getCallePrincipal()+" y "+direccion.getCalleSecundaria());*/
	}else {
		System.out.println("***"+getNombre()+" "+getApellido()+"***"+"\n"+
				"No tiene asociada una direccion");
	}
	
	
}
public void agregarTelefono(Telefono telefono) {
	telefenos.add(telefono);
}
public void mostrarTelefonos() {
	System.out.println("Teléfono con estado 'C'");
	for (Telefono telefono : telefenos) {
		if(telefono.getEstado().equals("C")) {
			System.out.println("Número: "+telefono.getNumero()+", Tipo: "+telefono.getTipo());
		}
	}
}
public ArrayList<Telefono> recuperarIncorrectos() {
	ArrayList<Telefono> telefonosIncorrectos= new ArrayList<Telefono>();
	for (Telefono telefono : telefenos) {
		if(telefono.getEstado().equals("E")) {
			telefonosIncorrectos.add(telefono);
		}
	}
	return telefonosIncorrectos;
}
}
