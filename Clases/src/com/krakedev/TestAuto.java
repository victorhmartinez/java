package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		//Modificamos los vvalores de los objetos
		auto1.setAnio(2010);
		auto1.setMarca("Toyota");
		auto1.setPrecio(2500.000);
		//Auto2
		auto2.setAnio(2020);
		auto2.setMarca("Chevrolet");
		auto2.setPrecio(10000.00);
		
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
