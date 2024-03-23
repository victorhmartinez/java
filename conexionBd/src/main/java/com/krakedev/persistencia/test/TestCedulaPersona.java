package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestCedulaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Persona persona= AdminPersonas.buscarPorCedula("1702345678");
			System.out.println(persona);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
