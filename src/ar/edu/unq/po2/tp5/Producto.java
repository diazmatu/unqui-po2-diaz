package ar.edu.unq.po2.tp5;

public class Producto implements ElementoCobrable{
	
	private String nombre;
	protected float precio;
	private int stock;
	
	public Producto(String nombre, float precio, int stock) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setStock(stock);
	}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public int getStock() {return stock;}
	public void setStock(int stock) {this.stock = stock;}

	public float getPrecio() {
		this.reducirStock(1);
		return precio;
	}
	public void reducirStock(int i) {
		this.setStock(this.getStock() - i);
	}

	public void setPrecio(float precio) {this.precio = precio;}

	public void aumentarPrecio(float aumento) {
		this.setPrecio(this.getPrecio() + aumento);	
	}

	@Override
	public float getTotal(int cantidad) {
		return this.getPrecio()*cantidad;
	}
}
