package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EstadoCivil ec = new EstadoCivil("U","UNION LIBRE");
		Persona p = new Persona("1105828279","Mario","Martinez",ec);
		try {
			Date fechaNac =Convertidor.convertirADate("200/01/23");
			Date horaNac =Convertidor.convertirAHora("12:23");
			p.setEstatura(1.75);
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(2000));
			p.setNumeroHijos(8);
			AdminPersonas.actualizar(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			System.out.println("Error en el sistema"+e.getMessage());
		}
	}

}
