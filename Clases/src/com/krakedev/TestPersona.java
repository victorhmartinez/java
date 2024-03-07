package com.krakedev;
/**
 * Cometarios en varias lineas
 * */
public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p; //Declaro una variable p de tipo Persona
		p=new Persona(); //Instacio un objeto persona
		Persona p2= new Persona();
		System.out.println("nombre:"+ p.nombre);
		System.out.println("edad:"+p.edadPersona);
		System.out.println("estatura"+p.estatura);
		//Modifico los atributos
		p.nombre="Mario";
		p.edadPersona=45;
		p.estatura=1.56;
		//5. accedo a los atirbutos
		System.out.println("---------------");
		System.out.println("Nombre:"+p.nombre);
		System.out.println("Edad:"+p.edadPersona);
		System.out.println("Estatura:"+p.estatura);
		
		p2.nombre="Angelina";
		System.out.println("---------------");
		System.out.println("p.nombre:"+p.nombre);
		System.out.println("p2.nombre:"+p2.nombre);
	
	}

}
