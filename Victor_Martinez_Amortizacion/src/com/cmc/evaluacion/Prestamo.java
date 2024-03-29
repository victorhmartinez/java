package com.cmc.evaluacion;

public class Prestamo {
private double monto;
private double interes;
private int plazo;
private Cuota[] cuota;
public Prestamo(double monto, double interes, int plazo) {
	
	this.monto = monto;
	this.interes = interes;
	this.plazo = plazo;
	this.cuota= new Cuota[this.plazo];
}
public double getMonto() {
	return monto;
}
public void setMonto(double monto) {
	this.monto = monto;
}
public double getInteres() {
	return interes;
}
public void setInteres(double interes) {
	this.interes = interes;
}
public int getPlazo() {
	return plazo;
}
public void setPlazo(int plazo) {
	this.plazo = plazo;
}
public Cuota[] getCuota() {
	return cuota;
}
public void mostrarPrestamo() {
	System.out.println("[ "+"monto= "+getMonto()+", interes="+getInteres()+", plazo="+getPlazo()+"]");
}
}
