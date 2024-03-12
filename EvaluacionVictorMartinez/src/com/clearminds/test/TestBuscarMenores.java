package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Celdas
		Celda c1= new Celda("K1234");
		Celda c2= new Celda("K1254");
		Celda c3= new Celda("K1284");
		Celda c4= new Celda("K1214");
		Celda c5= new Celda("K1264");
		Celda c6= new Celda("K1454");
		//Productos
		Producto p1= new Producto("Gatorade", "AK-45", 1.20);
		Producto p2= new Producto("Papitas", "KE34", 0.50);
		Producto p3= new Producto("Manzanas", "M778A", 0.10);
		Producto p4= new Producto("Doritos", "D789H", 0.40);
		Producto p5= new Producto("Peras", "P635", 0.15);
		Producto p6= new Producto("Colombinas", "C7845", 0.05);
		//Ingressmos los productos en sus celas
		c1.ingresarProducto(p1, 20);
		c2.ingresarProducto(p2, 5);
		c3.ingresarProducto(p3, 70);
		c4.ingresarProducto(p4, 15);
		c5.ingresarProducto(p5, 9);
		c6.ingresarProducto(p6, 14);
		//Ingresamos las celdas en la maquina de dulce
		MaquinaDulces md = new MaquinaDulces();
		md.agregarCelda(c1);
		md.agregarCelda(c2);
		md.agregarCelda(c3);
		md.agregarCelda(c4);
		md.agregarCelda(c5);
		md.agregarCelda(c6);
		//Mostramos en pantalla
		ArrayList<Producto>listaMenores=md.buscarMenores(0.50);
		System.out.println("Productos menores: "+listaMenores.size());
		for (int i = 0; i < listaMenores.size() ; i++) {
			System.out.println("Nombre: "+listaMenores.get(i).getNombre()+" Precio: "+listaMenores.get(i).getPrecio());
		}
	}

}
