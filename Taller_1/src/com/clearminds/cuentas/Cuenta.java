package com.clearminds.cuentas;

public class Cuenta {
private String id;
private String tipo="A";
private double saldo;

//Constructores
//Solo recibe un parametro
public Cuenta(String id) {
	this.id=id;
	this.tipo="A";
	this.saldo=0.0;
}
//Recibe los 3 parametros
public Cuenta(String id,String tipo,double saldo) {
	this.id=id;
	this.tipo=tipo;
	this.saldo=saldo;
}

//Metodos set y get
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public String getId() {
	return id;
}

public void imprimir() {
	System.out.println("***************************");
	System.out.println("Cuenta");
	System.out.println("***************************");
	System.out.println("Número de cuenta: "+this.id);
	System.out.println("Tipo: "+this.tipo);
	System.out.println("Saldo: "+this.saldo);
	
}
public void imprimirConMiEstilo() {
	System.out.println("|----------------------------|");
	System.out.println("++++++++++++Cuenta+++++++++++");
	System.out.println("|----------------------------|");
	System.out.println("|Número de cuenta: "+this.id);
	System.out.println("|----------------------------|");
	System.out.println("Tipo de cuenta: "+this.tipo);
	System.out.println("|----------------------------|");
	System.out.println("|Saldo de cuenta: "+this.saldo);
	
}
}

