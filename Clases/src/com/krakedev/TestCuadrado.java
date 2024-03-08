package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1= new Cuadrado();
		Cuadrado c2= new Cuadrado();
		Cuadrado c3= new Cuadrado();
		double areaC1,areaC2,areaC3;
		double periC1,periC2,periC3;
		//Seteamos los valores
		c1.lado=4;
		c2.lado=3;
		c3.lado=10;
		//Calculamos el area
		areaC1=c1.calcularArea();
		areaC2=c2.calcularArea();
		areaC3=c3.calcularArea();
		//Calculamos el area
		periC1=c1.calcularPerimetro();
		periC2=c2.calcularPerimetro();
		periC3=c3.calcularPerimetro();
		//Mostramos los valores
		System.out.println("Cuadrado 1:"+areaC1);
		System.out.println("Cuadrado 2:"+areaC2);
		System.out.println("Cuadrado 3:"+areaC3);
		
		System.out.println("Perimetro 1:"+periC1);
		System.out.println("Perimetro 2:"+periC2);
		System.out.println("Perimetro 3:"+periC3);
		
		
	}

}
