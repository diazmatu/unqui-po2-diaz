package ar.edu.unq.po2.tp5;

public class Cooperativa extends Producto {
	
	private float descuento;

	public Cooperativa(String nombre, float precio, int stock) {
		super(nombre, precio, stock);
		this.descuento = 0.1f;
	}
	
	public float descuentoEnPesos() {
		return this.precio*this.descuento;
	}
	
	@Override
	public float getPrecio() {
		this.reducirStock(1);
		return this.precio-this.descuentoEnPesos();
	}

}
