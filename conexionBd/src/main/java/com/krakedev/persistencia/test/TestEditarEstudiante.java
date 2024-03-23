package com.krakedev.persistencia.test;

import java.util.Date;

import com.krakedev.persistencia.entidades.Estudiantes;
import com.krakedev.persistencia.entidades.Profesor;
import com.krakedev.persistencia.servicios.AdminEstudiantes;
import com.krakedev.persistencia.utils.Convertidor;

public class TestEditarEstudiante {
public static void main(String[] args) {
	Estudiantes estudiante = new Estudiantes();
	estudiante.setCedula("1900234567");
	estudiante.setNombre("Juan");
	estudiante.setApellido("Alarcon");
	estudiante.setEmail("adrian_alar@gmail.com");
	
	estudiante.setCodigo_profesor(new Profesor(2, "Santiago"));
	try {
		Date fecha = Convertidor.convertirADate("1998/11/03");
		estudiante.setFecha_nacimiento(fecha);
		AdminEstudiantes.actualizarEstudiantes(estudiante);
		System.out.println("Estudiante actualizado");
	} catch (Exception e) {
		System.out.println("Error al actualizar el estudiante: "+e);
	}
}
}
