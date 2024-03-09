package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto = new Producto("Iphone XX", 1000);
		System.out.println("Antes de cambiar precio");
		System.out.println("Nombre: "+producto.getNombre());
		System.out.println("Precio: "+producto.getPrecio());

		producto.setPrecio(-2200);
		System.out.println("Despues de cambiar precio");
		System.out.println("Nombre: "+producto.getNombre());
		System.out.println("Precio: "+producto.getPrecio());

		
	System.out.println("Producto con descuento "+producto.calcularPrecioPromo(0.10));
	}

}
