package com.cmc.directorio.entidades;

public class AdminTelefono {
public void activarMensajeria(Telefono telefono) {
	if(telefono.getOperadora()=="movi") {
		telefono.setTieneWhatsapp(true);
	}
}
public int contarMovi(Telefono tele1,Telefono tele2,Telefono tele3 ) {
	int contadorMovi=0;
	if(tele1.getOperadora()=="movi") {
		contadorMovi++;
	}
	if(tele2.getOperadora()=="movi") {
		contadorMovi++;
	}
	if(tele3.getOperadora()=="movi") {
		contadorMovi++;
	}
	return contadorMovi;
}

public int contarClaro(Telefono tele1,Telefono tele2,Telefono tele3,Telefono tele4 ) {
	int contadorClaro=0;
	if(tele1.getOperadora()=="claro") {
		contadorClaro++;
	}
	if(tele2.getOperadora()=="claro") {
		contadorClaro++;
	}
	if(tele3.getOperadora()=="claro") {
		contadorClaro++;
	}
	if(tele4.getOperadora()=="claro") {
		contadorClaro++;
	}
	return contadorClaro;
}
}
