package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement ps = null;
		TestConexion tc = new TestConexion();
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"admin123");
			System.out.println("Conexion exitosa");
			tc.insertarProducto(ps, connection);
			tc.insertVentas(ps, connection);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insertarProducto(PreparedStatement ps, Connection connection) throws SQLException {
		ps = connection.prepareStatement(
				"insert into productos (codigo, nombre, descripcion, precio, stock) " + "values (?,?,?,?,?)");

		ps.setInt(1, 9863);
		ps.setString(2, "Pantalones Gris");
		ps.setString(3, "Ropa de color gris para hombre");
		ps.setBigDecimal(4, new BigDecimal(25));
		ps.setInt(5, 5);
		ps.executeUpdate();
		System.out.println("Ejecute insert productos");
	}
	public void insertVentas(PreparedStatement ps, Connection connection) throws SQLException {
		ps = connection.prepareStatement("insert into ventas (id_venta, codigo_producto, cantidad,fecha_venta)"
				 + "values (?,?,?,?)");
		ps.setInt(1, 320);
		ps.setInt(2, 9863);
		ps.setInt(3, 6);

		// Variable para obtener la fecha y pode guardarlas en sql
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String fechaStr = "2025/24/12 10:05:36";
		try {
			// Transformamos las fechas
			Date fecha = sdf.parse(fechaStr);
			long fechasMilis = fecha.getTime();
			// Creamos un java.sqlite, partiendo de un java.utl.date
			java.sql.Date fechaSq = new java.sql.Date(fechasMilis);
			// Agregamos los datos en la columnas
			ps.setDate(4, fechaSq);
			ps.executeUpdate();
			System.out.println("Ejecute insert ventas");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void insertPersonas(PreparedStatement ps, Connection connection) throws SQLException {
		ps = connection.prepareStatement("insert into persona (cedula, nombre, apellido, estatura,numero_hijos,"
				+ "estado_civil,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)" + "values (?,?,?,?,?,?,?,?,?)");
		ps.setString(1, "1105876543");
		ps.setString(2, "Marco");
		ps.setString(3, "Perez");
		ps.setDouble(4, 1.78);
		ps.setInt(5, 3);
		ps.setString(6, "C");
		ps.setBigDecimal(7, new BigDecimal(1200.34));
		// ps.setDa

		// Variable para obtener la fecha y pode guardarlas en sql
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String fechaStr = "2020/03/22 10:05:36";
		try {
			// Transformamos las fechas
			Date fecha = sdf.parse(fechaStr);
			System.out.println(fecha);
			long fechasMilis = fecha.getTime();
			System.out.println(fechasMilis);
			// Creamos un java.sqlite, partiendo de un java.utl.date
			java.sql.Date fechaSq = new java.sql.Date(fechasMilis);
			System.out.println(fechaSq);

			Time timeSql = new Time(fechasMilis);
			System.out.println(timeSql);
			// Agregamos los datos en la columnas
			ps.setDate(8, fechaSq);
			ps.setTime(9, timeSql);

			ps.executeUpdate();
			System.out.println("Ejecute insert");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
