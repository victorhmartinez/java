package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telef = new Telefono("movi", "0963457812", 20);
		Contacto c = new Contacto("Pedro", "Sanchez", telef, 25.4);
		c.imprimir();
		
	}

}
