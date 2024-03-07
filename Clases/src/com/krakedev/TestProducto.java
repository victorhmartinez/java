package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		//Modificamos su informacion
		//----Producto A
		productoA.descripcion="La descripcion del producto A";
		productoA.nombre="Parecetamol";
		productoA.precio=0.50f;
		productoA.stockActual=10;
		//----Producto B
		productoB.descripcion="La descripcion del producto B";
		productoB.nombre="Aspirinas";
		productoB.precio=0.20f;
		productoB.stockActual=6;
		//----Producto C
		productoC.descripcion="La descripcion del producto C";
		productoC.nombre="Jarabe para la tos";
		productoC.precio=2.5f;
		productoC.stockActual=100;
		//Mostramos los datos en pantalla
		System.out.println("Producto A: "+productoA.nombre);
		System.out.println("Producto A: "+productoA.descripcion);
		System.out.println("Producto A: "+productoA.precio);
		System.out.println("Producto A: "+productoA.stockActual);
		System.out.println("-----------------------------------");
		
		System.out.println("Producto B: "+productoB.nombre);
		System.out.println("Producto B: "+productoB.descripcion);
		System.out.println("Producto B: "+productoB.precio);
		System.out.println("Producto B: "+productoB.stockActual);
		System.out.println("-----------------------------------");
		
		System.out.println("Producto C: "+productoC.nombre);
		System.out.println("Producto C: "+productoC.descripcion);
		System.out.println("Producto C: "+productoC.precio);
		System.out.println("Producto C: "+productoC.stockActual);
		System.out.println("-----------------------------------");

				
	}

}
