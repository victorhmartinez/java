package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPesado(Contacto c1, Contacto c2) {
		Contacto contactoPesado=null;
		if(c1.getPeso()>c2.getPeso()) {
			contactoPesado=c1;
		}else {
			contactoPesado=c2;
		}
		return contactoPesado;
	}
	public boolean compararOperadoras(Contacto c1, Contacto c2) {
		if(c1.getTelefono().getOperadora()==c2.getTelefono().getOperadora()) {
			return true;
		}else {
			return false;
		}
		
	}
	public void activarUsuario(Contacto c) {
		if(c.getTelefono().isTieneWhatsapp()) {
			c.setActivo(true);
		}
	}
	
}
