package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public Directorio() {
		contactos = new ArrayList<Contacto>();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public boolean agregarContacto(Contacto contacto) {
		boolean ingresado = true;

		for (Contacto contact : contactos) {
			if (contact.getCedula().equals(contacto.getCedula())) {
				ingresado = false;

			}
		}

		if (ingresado) {
			contactos.add(contacto);
			setFechaModificacion(new Date());
		}

		return ingresado;
	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto contactoEncontrado = null;
		for (Contacto contacto : contactos) {
			if (contacto.getCedula().equals(cedula)) {
				contactoEncontrado = contacto;
			}
		}
		return contactoEncontrado;
	}

	public String consultarUltimaModificacion() {
		String fecha;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		fecha = sdf.format(getFechaModificacion());
		return fecha;
	}

	public int contarPerdidos() {
		int perdidos = 0;
		for (Contacto contacto : contactos) {
			if (contacto.getDireccion() == null) {
				perdidos++;
			}
		}
		return perdidos;
	}

	public int contarFijos() {
		int fijos = 0;
		ArrayList<Telefono> telefonos = new ArrayList<Telefono>();
		for (Contacto contacto : contactos) {
			if (contacto.getTelefenos().size() > 0) {
				telefonos = contacto.getTelefenos();
				for (Telefono telefono : telefonos) {
					if (telefono.getTipo().equals("Convencional") && telefono.getEstado().equals("C")) {
						fijos++;
					}
				}
			}
		}
		return fijos;
	}

	public void depurar() {
		for (int i = 0; i < contactos.size(); i++) {
			Contacto contacto = contactos.get(i);
			if (contacto.getDireccion() == null) {
				incorrectos.add(contacto);
				contactos.remove(i);
				i--;
			} else {
				correctos.add(contacto);
				contactos.remove(i);
				i--;
			}
		}
	}

}
