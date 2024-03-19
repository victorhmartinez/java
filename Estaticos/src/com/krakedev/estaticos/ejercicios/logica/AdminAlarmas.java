package com.krakedev.estaticos.ejercicios.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicios.entidades.Alarma;

public class AdminAlarmas {
private ArrayList<Alarma> alarmas;
public AdminAlarmas() {
	this.alarmas=new ArrayList<Alarma>();
}
public void agregarAlarma(Alarma alarma) {
	alarmas.add(alarma);
}
public ArrayList<Alarma> getAlarmas() {
	return alarmas;
}

}
