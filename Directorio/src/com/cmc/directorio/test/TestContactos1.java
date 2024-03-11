package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto contactoPesado=null;
		Telefono telef = new Telefono("movi", "0963457812", 20);
		Contacto c = new Contacto("Pedro", "Sanchez", telef, 25.4);
		Telefono telef2 = new Telefono("claro", "098251522", 50);
		Contacto c2 = new Contacto("Genesis", "Escobar", telef2, 10.4);
		AdminContactos ac= new AdminContactos();
		
		contactoPesado=ac.buscarMasPesado(c, c2);
		System.out.println("El contacto mas pesado es: ");
		contactoPesado.imprimir();
		
		System.out.println("Ambas operadoras son iguales: " +ac.compararOperadoras(c, c2));
	
	}

}
