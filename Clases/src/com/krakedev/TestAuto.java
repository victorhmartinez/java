package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos los objetos con el constructor
		Auto auto1 = new Auto("Toyota",2010,2500.000);
		Auto auto2 = new Auto("Chevrolet",2020,10000.00);
		
		//Mostramos datos de auto1
		System.out.println("Carro1:"+auto1.getMarca());
		System.out.println("Carro1:"+auto1.getAnio());
		System.out.println("Carro1:"+auto1.getPrecio());
		//Mostramos los datos del auot2
		System.out.println("Carro2:"+auto2.getMarca());
		System.out.println("Carro2:"+auto2.getAnio());
		System.out.println("Carro2:"+auto2.getPrecio());
	}
	
}
