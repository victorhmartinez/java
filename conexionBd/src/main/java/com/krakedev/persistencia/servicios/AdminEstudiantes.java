package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Estudiantes;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminEstudiantes {
	private static final Logger LOGGER = LogManager.getLogger(AdminEstudiantes.class);
	public static void insaertarEstudiantes(Estudiantes estudiante) throws Exception{
		Connection connection = null;
		PreparedStatement ps= null;
		LOGGER.trace("Usuario a insertar: "+estudiante);
		try {
			connection =  ConexionBDD.conectar();
			ps = connection.prepareStatement("INSERT INTO estudiantes (cedula, nombre, apellido,email,fecha_nacimiento,codigo_profesor) "
					+ " VALUES(?,?,?,?,?,?)");
			ps.setString(1, estudiante.getCedula());
			ps.setString(2, estudiante.getNombre());
			ps.setString(3, estudiante.getApellido());
			ps.setString(4, estudiante.getEmail());
			ps.setDate(5, new Date(estudiante.getFecha_nacimiento().getTime()));			
			ps.setInt(6, estudiante.getCodigo_profesor().getCodigo());
			ps.executeUpdate();			
			
		} catch (Exception e) {
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static void actualizarEstudiantes(Estudiantes estudiante) throws Exception{
		Connection connection = null;
		PreparedStatement ps= null;
		LOGGER.trace("Usuario a actualizar: "+estudiante);
		try {
			connection =  ConexionBDD.conectar();
			ps = connection.prepareStatement("UPDATE estudiantes "
					+ " SET nombre = ?,"
					+ " apellido = ?,"
					+ "	email = ?,"
					+ "	fecha_nacimiento = ?,"
					+ " codigo_profesor = ? "
					+ " WHERE cedula = ?;");
			
			ps.setString(1, estudiante.getNombre());
			ps.setString(2, estudiante.getApellido());
			ps.setString(3, estudiante.getEmail());
			ps.setDate(4, new Date(estudiante.getFecha_nacimiento().getTime()));			
			ps.setInt(5, estudiante.getCodigo_profesor().getCodigo());
			ps.setString(6, estudiante.getCedula());
			
			
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
	public static void eliminarEstudiante(Estudiantes estudiante) throws Exception{
		Connection connection = null;
		PreparedStatement ps= null;
		LOGGER.trace("Estudiante a eliminar con cedula: "+estudiante.getCedula());
		try {
			connection =  ConexionBDD.conectar();
			ps = connection.prepareStatement("delete from estudiantes where cedula= ?;");	
			ps.setString(1, estudiante.getCedula());
			
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