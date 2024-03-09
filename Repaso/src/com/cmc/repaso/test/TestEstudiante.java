package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiantes;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiantes estudiante = new Estudiantes("Carlos");
		estudiante.calificar(7);
		System.out.println(estudiante.getResultado());
	}

}
