package com.krakedev;

public class Cuadrado {
 private int lado;
 public double calcularArea() {
	double area= Math.pow(lado, 2);
	 return area;
 }
 public double calcularPerimetro() {
	double perimetro = lado*4;
	 return perimetro;
 }
public int getLado() {
	return lado;
}
public void setLado(int lado) {
	this.lado = lado;
}
 
}
