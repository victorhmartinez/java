package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1= new Rectangulo();
		Rectangulo r2= new Rectangulo();
		int areaR1;
		int areaR2;
		double perimetroR1;
		double perimetroR2;
		//Seteamos los valores
		r1.setBase(10);
		r1.setAltura(5);
		
		r2.setBase(8);
		r2.setAltura(3);
		
		areaR1=r1.calcularArea();
		System.out.println("La area de r1: "+ areaR1);
		
		areaR2=r2.calcularArea();
		System.out.println("La area de r2: "+ areaR2);
		//Calculamos los perimetros
		perimetroR1=r1.calcularPerimetro();
		System.out.println("El perimetro de r1 "+ perimetroR1);
		perimetroR2=r2.calcularPerimetro();
		System.out.println("El perimetro de r2: "+ perimetroR2);
	}

}
