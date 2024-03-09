package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestProductos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item= new Item();
		item.setProductoActuales(20);
		System.out.println("Valores iniciales");
		item.imprimir();
		System.out.println("------------------");

		System.out.println("Valores modificados");
		item.vender(15);
		item.devolver(10);
		item.imprimir();
		System.out.println("*******************");
		
		Item item2= new Item();
		item2.setProductoActuales(68);
		System.out.println("Valores iniciales");
		item2.imprimir();
		System.out.println("------------------");
		System.out.println("Valores modificados");
		item2.vender(18);
		item2.vender(4);
		item2.devolver(7);
		item2.imprimir();
	}

}
