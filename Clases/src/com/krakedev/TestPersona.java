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
		Persona p3= new Persona("Maria");
		Persona p4 = new Persona("Carlos", 28, 1.68);
	
		
		System.out.println("nombre:"+ p4.getNombre());
		System.out.println("edad:"+p4.getEdadPersona());
		System.out.println("estatura"+p4.getEstatura());
		
		
		System.out.println("nombre:"+ p.getNombre());
		System.out.println("edad:"+p.getEdadPersona());
		System.out.println("estatura"+p.getEstatura());
		//Modifico los atributos
		p.setNombre("Mario");
		p.setEdadPersona(45);
		p.setEstatura(1.56);
		//5. accedo a los atirbutos
		System.out.println("---------------");
		System.out.println("Nombre:"+p.getNombre());
		System.out.println("Edad:"+p.getEdadPersona());
		System.out.println("Estatura:"+p.getEstatura());
		
		p2.setNombre("Angelina");
		System.out.println("---------------");
		System.out.println("p.nombre:"+p.getNombre());
		System.out.println("p2.nombre:"+p2.getNombre());
	
	}

}
