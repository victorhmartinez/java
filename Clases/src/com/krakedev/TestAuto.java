package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		//Modificamos los vvalores de los objetos
		auto1.anio=2010;
		auto1.marca="Toyota";
		auto1.precio=2500.000;
		//Auto2
		auto2.anio=2020;
		auto2.marca="Chevrolet";
		auto2.precio=10000.00;
		//Mostramos datos de auto1
		System.out.println("Carro1:"+auto1.marca);
		System.out.println("Carro1:"+auto1.anio);
		System.out.println("Carro1:"+auto1.precio);
		//Mostramos los datos del auot2
		System.out.println("Carro2:"+auto2.marca);
		System.out.println("Carro2:"+auto2.anio);
		System.out.println("Carro2:"+auto2.precio);
	}
	
}
