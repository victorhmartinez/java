package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		//Modificamos su informacion
		//----Producto A
		productoA.setDescripcion("La descripcion del producto A");
		productoA.setNombre("Parecetamol");
		productoA.setPrecio(0.50f);
		productoA.setStockActual(10);
		//----Producto B
		productoB.setDescripcion("La descripcion del producto B");
		productoB.setNombre("Aspirinas");
		productoB.setPrecio(0.20f);
		productoB.setStockActual(6);
		
		//----Producto C
		
		productoC.setDescripcion("La descripcion del producto C");
		productoC.setNombre("Jarabe para la tos");
		productoC.setPrecio(2.5f);
		productoC.setStockActual(100);
		
	
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
