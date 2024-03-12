package krakedev.entidades;

import java.util.ArrayList;


public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> listNotas =new ArrayList<Nota>();

	public Estudiante( String cedula,String nombre, String apellido) {
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getListNotas() {
		return listNotas;
	}

	public void setListNotas(ArrayList<Nota> listNotas) {
		this.listNotas = listNotas;
	}

	public void agregarNota(Nota nuevaNota) {
		Nota elementoNota;
	if(listNotas.size()==0) {

	listNotas.add(nuevaNota);
	}else {
		for (int i = 0; i <listNotas.size(); i++) {
			elementoNota = listNotas.get(i);
			if (elementoNota.getMateria().getCodigo() != nuevaNota.getMateria().getCodigo()) {
				if (nuevaNota.getCalificacion() > 0 && nuevaNota.getCalificacion() <= 10) {
					listNotas.add(nuevaNota);
				break;
				}
			}
		}
	}
		
	}

	public double calcularPromedioNotasEstudiante() {
		double promedio = 0.0;
		double sumatoria = 0.0;
		Nota elementoNota;
		for (int i = 0; i < listNotas.size(); i++) {
			elementoNota = listNotas.get(i);
			sumatoria += elementoNota.getCalificacion();
		}
		promedio = sumatoria / listNotas.size();
		return promedio;
	}

	public void mostrar() {
		String dataEstudiante = "Estudiante[ Nombre: " + getNombre() + " Apellido: " + getApellido() + " Cedula:"
				+ getCedula() + "]";
		System.out.println(dataEstudiante);
		Nota notaElemento;
		for (int i = 0; i < listNotas.size(); i++) {
			notaElemento = listNotas.get(i);
			
			notaElemento.mostrar();
		}
	}

}
