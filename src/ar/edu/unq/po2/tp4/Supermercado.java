package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private ArrayList<Producto> listaDeProductos;
	private float precioTotal;
	
	public Supermercado(String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.listaDeProductos = new ArrayList<Producto>();
		this.setPrecioTotal(0);
	}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public String getDireccion() {return direccion;}
	public void setDireccion(String direccion) {this.direccion = direccion;}

	public ArrayList<Producto> getListaDeProductos() {return listaDeProductos;}

	public void agregarProducto(Producto producto) {
		this.listaDeProductos.add(producto);
	}

	public Integer getCantidadDeProductos() {return this.listaDeProductos.size();}

	public void setPrecioTotal(float precioTotal) {this.precioTotal = precioTotal;}
	public Float getPrecioTotal() {
		for	(Producto producto:this.listaDeProductos) {
			this.precioTotal = this.precioTotal + producto.getPrecio();
		}
		return this.precioTotal;
	}	
}
