package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

public static void insertar(Persona persona) throws Exception {
	Connection connection= null;
	PreparedStatement ps;
	LOGGER.trace("Persona a insertar>>>"+persona);
	try {
		connection=ConexionBDD.conectar();
		ps = connection.prepareStatement("insert into persona (cedula, nombre, apellido, estatura,numero_hijos,"
				+ "estado_civil,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)" 
				+ "values (?,?,?,?,?,?,?,?,?)");
		ps.setString(1, persona.getCedula());
		ps.setString(2, persona.getNombre());
		ps.setString(3, persona.getApellido());
		ps.setDouble(4, persona.getEstatura());
		ps.setInt(5, persona.getNumeroHijos());
		ps.setString(6, persona.getEstadoCivil().getCodigo());
		ps.setBigDecimal(7, persona.getCantidadAhorrada());
		ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
		ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));

		ps.executeUpdate();
		System.out.println("Insertar");
	} catch (Exception e) {
		LOGGER.error("Error al insertar",e);
		//Mostar el error al usuario
		throw new Exception("Error al insertar");
		//logger
		
	}finally {
		//Cerrar la conexion
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LOGGER.error("Error con la base",e);
			throw new Exception("Error con la base ");
		}
	}
}
public static void actualizar(Persona per) throws Exception{
	Connection connection = null;
	PreparedStatement ps= null;
	LOGGER.trace("Persona a actualizar: "+per);
	try {
		connection =  ConexionBDD.conectar();
	
		ps = connection.prepareStatement("UPDATE persona"
				+ " SET nombre = ?,"
				+ " apellido = ?,"
				+ "	estatura = ?,"
				+ " fecha_nacimiento = ?,"
				+ "	hora_nacimiento = ?,"
				+ " cantidad_ahorrada = ?,"
				+ "	numero_hijos = ?,"
				+ "	estado_civil = ? "
				+ " WHERE cedula = ?;");
		ps.setString(1, per.getNombre());
		ps.setString(2, per.getApellido());
		ps.setDouble(3, per.getEstatura());
		ps.setDate(4, new java.sql.Date(per.getFechaNacimiento().getTime()));
		ps.setTime(5, new Time(per.getHoraNacimiento().getTime()));
		ps.setBigDecimal(6, per.getCantidadAhorrada());
		ps.setInt(7, per.getNumeroHijos());
		ps.setString(8, per.getEstadoCivil().getCodigo());
		
		ps.setString(9, per.getCedula());
		
		
		ps.executeUpdate();		
		
		
	} catch (Exception e) {
		LOGGER.error("Error al actualizar", e);
		throw new Exception("Error al actualizar");
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			LOGGER.error("Error con la base de datos", e);
			throw new Exception("Error con la base de datos");
		}
	}
	
}
public static void eliminar(Persona per) throws Exception{
	//Prohibido usar el System.out.println(); si no es test
	Connection connection = null;
	PreparedStatement ps= null;
	LOGGER.trace("Persona a eliminar con cedula: "+per.getCedula());
	try {
		connection =  ConexionBDD.conectar();
		ps = connection.prepareStatement("delete from persona where cedula= ?;");	
		ps.setString(1, per.getCedula());

		ps.executeUpdate();			
		
	} catch (Exception e) {
		LOGGER.error("Error al eliminar", e);
		throw new Exception("Error al eliminar");
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			LOGGER.error("Error con la base de datos", e);
			throw new Exception("Error con la base de datos");
		}
	}
	
}

}
