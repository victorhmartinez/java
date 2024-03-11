package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {
	public static void main(String[] args) {
		/*
		 * La linea q genera el error es donde se llama a get producto\
		 * Se genera en la clase celda en la variable producto.
		 * */
		
		Celda celda=new Celda("A1");
		System.out.println(celda.getProducto().getNombre()); //En esta linea provoca el error
		
		System.out.println("CELDA:"+celda.getProducto());
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:"+celda.getProducto().getCodigo());
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
	}
}
