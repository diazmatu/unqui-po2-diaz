package ar.edu.unq.po2.tp5;

public class Factura implements ElementoCobrable {
	
	private float precio;
	
	public Factura() {this.setPrecio(0);}
	
	public Factura(float precio) {this.setPrecio(precio);}
	
	@Override
	public float getPrecio() {return this.precio;}
	public void setPrecio(float precio) {this.precio = precio;}

	@Override
	public float getTotal(int cantidad) {
		return this.getPrecio()*cantidad;
	}

}
