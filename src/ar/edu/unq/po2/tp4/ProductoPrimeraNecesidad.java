package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private float porcentajeDescuento;

	
	public float getPorcentajeDescuento() {return porcentajeDescuento;}
	public void setPorcentajeDescuento(float descuento) {this.porcentajeDescuento = descuento/100;}

	public ProductoPrimeraNecesidad(String nombre, float precio, boolean precioCuidado, float porcentaje) {
		super(nombre, precio, precioCuidado);
		this.setPorcentajeDescuento(porcentaje);
	}

	public ProductoPrimeraNecesidad(String nombre, float precio, float porcentaje) {
		super(nombre, precio);
		this.setPorcentajeDescuento(porcentaje);
		}
	
	@Override
	public float getPrecio() {
		float precio = this.precio * (1 - this.getPorcentajeDescuento());
		return precio;
	}

} 
