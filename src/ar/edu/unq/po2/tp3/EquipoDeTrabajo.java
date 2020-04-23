package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	private String nombre;
	private ArrayList<Persona> integrantes;

	public EquipoDeTrabajo(String nom) {
		this.setNombre(nom);
		this.integrantes = new ArrayList<Persona>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarIntegrante(Persona p) {
		this.integrantes.add(p);
	}
	
	public void sacarIntegrante(Persona p) {
		this.integrantes.remove(p);
	}
	
	public float promedioEdad() {
		float promedio = 0;
		for (Persona p:this.integrantes) {
			promedio = promedio + p.getEdad();
		}
		return promedio/this.integrantes.size();
	}
}
