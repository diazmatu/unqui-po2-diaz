package ar.edu.unq.po2.tp3;

import java.util.Calendar;
import java.util.Date;

public class Persona {
	
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private int edad;
	
	public Persona(String nom, String ape, Date fecha) {
		this.setNombre(nom);
		this.setApellido(ape);
		this.setFechaDeNacimiento(fecha);
		this.setEdad();
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad() {
		this.edad = this.getEdad();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public int getEdad() {
		Calendar cal = Calendar.getInstance();
		Date date = this.getFechaDeNacimiento();
		cal.setTime(date);
		int dateYear = cal.get(Calendar.YEAR);
		int nowYear = Calendar.getInstance().get(Calendar.YEAR);
		return (nowYear - dateYear);
	}
	
	public boolean menorQue(Persona persona) {
		return this.getEdad()<persona.getEdad();
	}
	
	
}
