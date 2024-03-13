package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;

	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		validar();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void validar() {
	    if (getNumero() == null || getTipo() == null) {
	        setEstado("E");
	    } else if (!getTipo().equals("Movil") && !getTipo().equals("Convencional")) {
	        setEstado("E");
	    } else if ((getTipo().equals("Movil") && getNumero().length() != 10) || (getTipo().equals("Convencional") && getNumero().length() != 7)) {
	        setEstado("E");
	    } else {
	        setEstado("C");
	    }
	}

}
