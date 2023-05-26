package model;

import java.util.ArrayList;

public class Diplomado {
	private String nombre;
	private int cupo;
	ArrayList<Estudiante> listaEstudiantes;

	public Diplomado() {
		super();
	}

	public Diplomado(String nombre, int cupo, ArrayList<Estudiante> listadaEstudiantes) {
		super();
		this.nombre = nombre;
		this.cupo = cupo;
		this.listaEstudiantes = listadaEstudiantes;
	}

	public ArrayList<Estudiante> getListadaEstudiantes() {
		return listaEstudiantes;
	}

	public void setListadaEstudiantes(ArrayList<Estudiante> listadaEstudiantes) {
		this.listaEstudiantes = listadaEstudiantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCupo() {
		return cupo;
	}

	public void setCupo(int cupo) {
		this.cupo = cupo;
	}

	public Estudiante crearEstudianteDiplomado(String nombre, TipoGenero genero, String identificacion, ArrayList<Float> listaNotas) throws Exception{
		Estudiante estudiante = new Estudiante(identificacion, genero, identificacion, 0, 0, 0, 0, 0, listaNotas);
		estudiante.setNombre(nombre);
		estudiante.setGenero(genero);
		estudiante.setIdentificacion(identificacion);
		estudiante.setListaNotas(listaNotas);;

		if (existeEstudiante(identificacion) == true) {
			throw new Exception("Estudiante ya existe");
		}
		listaEstudiantes.add(estudiante);
		return estudiante;
	}

	private boolean existeEstudiante(String identificacion) {
		for (Estudiante estudiante : listaEstudiantes) {
			if(estudiante.getIdentificacion().equals(identificacion)){
				return true;
			}
		}
		return false;
	}
}
