package com.krakedev;

public class Cuadrado {
 int lado;
 public double calcularArea() {
	double area= Math.pow(lado, 2);
	 return area;
 }
 public double calcularPerimetro() {
	double perimetro = lado*4;
	 return perimetro;
 }
}
