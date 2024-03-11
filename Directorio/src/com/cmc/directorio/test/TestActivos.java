package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telef = new Telefono("claro", "0963457812", 20);
		Contacto c = new Contacto("Pedro", "Sanchez", telef, 25.4);
	AdminContactos ac= new AdminContactos();
	ac.activarUsuario(c);
	c.imprimir();
	
	Telefono telef2 = new Telefono("movi", "0963457812", 20);
	Contacto c2 = new Contacto("Carlos", "Sanchez", telef2, 25.4);
	AdminTelefono at = new AdminTelefono();
	at.activarMensajeria(telef2);
	ac.activarUsuario(c2);
	c2.imprimir();
	}

}
