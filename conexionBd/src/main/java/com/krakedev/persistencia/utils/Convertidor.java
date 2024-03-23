package com.krakedev.persistencia.utils;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Convertidor {
	private static final String FORMATO="yyyy/MM/dd";
	private static final String FORMATO_HORA="hh:mm";
	private static final Logger LOGGER = LogManager.getLogger(Convertidor.class);

public static Date convertirADate(String fechaStr) throws Exception {
	SimpleDateFormat sdf = new SimpleDateFormat(FORMATO);
	Date fechaDate=null;
	
	try {
		LOGGER.trace("Convirtiendo fecha"+fechaStr);

		 fechaDate= sdf.parse(fechaStr);
			LOGGER.trace("Fecha convertida"+fechaDate);

	} catch (ParseException e) {
		LOGGER.error("La fecha no tiene formato"+fechaStr,e);
		throw new Exception("La fecha no tiene formato"+fechaStr);
	}
	return fechaDate;
}

public static Date convertirAHora(String horaStr) throws Exception {
	SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_HORA);
	Date horaDate=null;
	
	try {
		 horaDate= sdf.parse(horaStr);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		LOGGER.error("La hora no tiene formato"+horaStr,e);

		throw new Exception("La hora no tiene formato"+horaStr);
	}
	return horaDate;
}
}
