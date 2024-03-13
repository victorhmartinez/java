package com.krakedev.evaluacion;

public class Direccion {
private String callePrincipal;
private String calleSecundaria;

public Direccion(String callePrincipal, String calleSecundario) {
	this.callePrincipal = callePrincipal;
	this.calleSecundaria = calleSecundario;
}
public String getCallePrincipal() {
	return callePrincipal;
}
public void setCallePrincipal(String callePrincipal) {
	this.callePrincipal = callePrincipal;
}
public String getCalleSecundaria() {
	return calleSecundaria;
}
public void setCalleSecundaria(String calleSecundario) {
	this.calleSecundaria = calleSecundario;
}

}
