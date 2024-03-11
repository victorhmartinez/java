package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telefono1 = new Telefono("claro", "098245232", 10);
		Telefono telefono2 = new Telefono("claro", "098765432", 20);
		Telefono telefono3 = new Telefono("movi", "096712324", 50);
		Telefono telefono4 = new Telefono("claro", "0934545487", 40);
		AdminTelefono at = new AdminTelefono();

		System.out.println("La cantidad de claro es: " + at.contarClaro(telefono1, telefono2, telefono3, telefono4));

	}
}
