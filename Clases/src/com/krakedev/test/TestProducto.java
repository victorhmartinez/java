package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//----Producto A
		Producto productoA = new Producto("Parecetamol","La descripcion del producto A",0.50f,10);
		//----Producto B
		Producto productoB = new Producto("Aspirinas","La descripcion del producto B",0.20f,6);
		//----Producto C
		Producto productoC = new Producto("Jarabe para la tos","La descripcion del producto C",2.5f,100);
	
		
	
		//Mostramos los datos en pantalla
		System.out.println("Producto A: "+productoA.getNombre());
		System.out.println("Producto A: "+productoA.getDescripcion());
		System.out.println("Producto A: "+productoA.getPrecio());
		System.out.println("Producto A: "+productoA.getStockActual());
		System.out.println("-----------------------------------");
		
		System.out.println("Producto B: "+productoB.getNombre());
		System.out.println("Producto B: "+productoB.getDescripcion());
		System.out.println("Producto B: "+productoB.getPrecio());
		System.out.println("Producto B: "+productoB.getStockActual());
		System.out.println("-----------------------------------");
		
		System.out.println("Producto C: "+productoC.getNombre());
		System.out.println("Producto C: "+productoC.getDescripcion());
		System.out.println("Producto C: "+productoC.getPrecio());
		System.out.println("Producto C: "+productoC.getStockActual());
		System.out.println("-----------------------------------");

				
	}

}
