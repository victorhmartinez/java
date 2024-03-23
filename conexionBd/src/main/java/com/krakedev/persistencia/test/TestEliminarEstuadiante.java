package com.krakedev.persistencia.test;


import com.krakedev.persistencia.entidades.Estudiantes;
import com.krakedev.persistencia.servicios.AdminEstudiantes;

public class TestEliminarEstuadiante {
public static void main(String[] args) {
	Estudiantes estudiante = new Estudiantes();
	estudiante.setCedula("1900234567");
	try {

		AdminEstudiantes.eliminarEstudiante(estudiante);
		System.out.println("Estudiante eliminado");
	} catch (Exception e) {
		System.out.println("Error al eliminar el estudiante: "+e);
	}
}
}
