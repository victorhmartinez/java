package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicios.entidades.Alarma;
import com.krakedev.estaticos.ejercicios.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicios.utils.DiaSemana;

public class TestAlarmas {
public static void main(String[] args) {
	//Alarmas
	Alarma alarma1 = new Alarma(DiaSemana.LUNES, 12, 50);
	Alarma alarma2 = new Alarma(DiaSemana.MIERCOLES, 16, 35);
	Alarma alarma3 = new Alarma(DiaSemana.JUEVES, 9, 5);
	Alarma alarma4 = new Alarma(DiaSemana.SABADO, 14, 28);
	//Creamos el admin de alarmas
	AdminAlarmas adAlarmas= new AdminAlarmas();
	adAlarmas.agregarAlarma(alarma1);
	adAlarmas.agregarAlarma(alarma2);
	adAlarmas.agregarAlarma(alarma3);
	adAlarmas.agregarAlarma(alarma4);
	//Recuperamos las alarmas 
	ArrayList<Alarma>alarmasActuales=adAlarmas.getAlarmas();
	System.out.println(alarmasActuales);
}
}
