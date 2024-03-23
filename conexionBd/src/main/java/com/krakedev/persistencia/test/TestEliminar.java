package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {
public static void main(String[] args) {
	EstadoCivil ec = new EstadoCivil("U","UNION LIBRE");

	Persona p = new Persona("1105828279","Mario","Martinez",ec);

	try {
		AdminPersonas.eliminar(p);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
