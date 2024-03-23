package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {
public static void main(String[] args) {
	//Date - java.util.Date
	//Date - java.sql.Date
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	String fechaStr="2020/03/22 10:05:36";
	try {
		Date fecha=sdf.parse(fechaStr);
		System.out.println(fecha);
		long fechasMilis=fecha.getTime();
		System.out.println(fechasMilis);
		//Creamos un java.sqlite, partiendo de un java.utl.date
		java.sql.Date fechaSq= new java.sql.Date(fechasMilis);
		System.out.println(fechaSq);
		
		Time timeSql = new Time(fechasMilis);
		System.out.println(timeSql);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
