package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> listEstudiantes;

	public Curso() {
		listEstudiantes = new ArrayList<Estudiante>();
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return listEstudiantes;
	}

	public void setListEstudiantes(ArrayList<Estudiante> listEstudiantes) {
		this.listEstudiantes = listEstudiantes;
	}

	public String buscarEsdtudiantePorCedula(Estudiante estudiante) {
		Estudiante elementoEstudiante=null;
		Estudiante estudianteEncontrado = null;
		for (int i = 0; i < listEstudiantes.size(); i++) {
			elementoEstudiante = listEstudiantes.get(i);
			if (estudiante.getCedula().equals(elementoEstudiante.getCedula())) {
				estudianteEncontrado = elementoEstudiante;
				
			}
		}
		if (estudianteEncontrado == null) {
			return null;
		} else {
			return "El estudiante ya se encuentra en este curso";
		}
	}
	public void matricularEstudiante(Estudiante estudiante) {
		String estudianteEncontrado = buscarEsdtudiantePorCedula(estudiante);
		if(estudianteEncontrado!=null) {
			System.out.println(estudianteEncontrado);
		}else {
			listEstudiantes.add(estudiante);
		}
		
	}
	
	public double calcularPromedioCurso() {
		double sumatoria=0.0;
		double promedio=0.0;
		Estudiante elementoEstudinate;
		for (int i = 0; i < listEstudiantes.size(); i++) {
		elementoEstudinate=listEstudiantes.get(i);
		sumatoria+=elementoEstudinate.calcularPromedioNotasEstudiante();
		}
		promedio=sumatoria/listEstudiantes.size();
		return promedio;
	}
	
	public void mostrar() {
		Estudiante elementoEstudiante;
		System.out.print("Curso [ ");
		
		for (int i = 0; i < listEstudiantes.size(); i++) {
			elementoEstudiante=listEstudiantes.get(i);
		elementoEstudiante.mostrar();
		}
		System.out.print("]");
	}
}
