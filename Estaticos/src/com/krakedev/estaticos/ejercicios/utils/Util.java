package com.krakedev.estaticos.ejercicios.utils;

public class Util {
	public static String formatearHora(int numero) {
		String valor = numero + "";
		if (valor.length() == 1) {
			valor = "0" + valor;
		}

		return valor;
	}

	public static String formatearDia(int numer) {
		String valor = "";
		switch (numer) {
		case 0:
			valor="Lunes";
			break;
		case 1:
			valor="Martes";
			break;
		case 2:
			valor="Miercoles";
			break;
		case 3:
			valor="Jueves";
			break;
		case 4:
			valor="Viernes";
			break;
		case 5:
			valor="Sabado";
			break;
		case 6:
			valor="Domingo";
			break;
		default:
			break;
		}
		return valor;
	}
}
