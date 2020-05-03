package ar.edu.unq.po2.tp4;

import java.text.DecimalFormat;

public class Producto {
	
	private String nombre;
	protected float precio;
	private boolean precioCuidado;
	
	public Producto(String nombre, float precio, boolean precioCuidado) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPreciosCuidados(precioCuidado);		
	}
	
	public Producto(String nombre, float precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPreciosCuidados(false);	
	}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public float getPrecio() {return precio;}
	public void setPrecio(float precio) {this.precio = precio;}

	public boolean esPrecioCuidado() {return precioCuidado;}
	public void setPreciosCuidados(boolean preciosCuidados) {this.precioCuidado = preciosCuidados;}

	public void aumentarPrecio(float aumento) {
		this.setPrecio(this.getPrecio() + aumento);	
	}
	/*	
	public float roundTwoDecimals(float f) {
		DecimalFormat twoFForm = new DecimalFormat("#.##");
		return Integer.valueOf(twoFForm.format(d));
	}*/
}
