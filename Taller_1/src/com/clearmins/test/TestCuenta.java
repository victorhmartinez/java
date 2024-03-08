package com.clearmins.test;

import com.clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo el objeto cuenta y lo referencio con cuenta 1
		Cuenta cuenta1 = new Cuenta("03476");
		//Coloco un valor de saldo en la cuenta 1
		cuenta1.setSaldo(675);
		
		//Creo el obejto cuenta y lo referencio con cuenta 2
		Cuenta cuenta2 = new Cuenta("03476","C",98);
		
		//Creo cuenta y lo referencio con cueta 3
		Cuenta cuenta3 = new  Cuenta("03476");
		//Modifico el tipo de cuenta
		cuenta3.setTipo("C");
		
		//Imprimo cuenta1,cuenta2,cuenta3
		System.out.println("-----------Valores iniciales----------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		System.out.println("-----------Valores Modificado----------");
		cuenta1.setSaldo(444);
		cuenta2.setSaldo(567);
		cuenta3.setTipo("D");
		
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		//Creo cuenta y lo referencio con cuenta 4
		Cuenta cuenta4 = new  Cuenta("0987");
		cuenta4.setSaldo(10);
		cuenta4.setTipo("A");
		//Creo cuenta y lo referencio con cuenta 5
		Cuenta cuenta5 = new  Cuenta("0557","C",10);
		//Creo cuenta y lo referencio con cuenta 6
		Cuenta cuenta6 = new  Cuenta("0666","A",0);
	System.out.println("Imprimiendo con mi estilo");
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
	}

}
