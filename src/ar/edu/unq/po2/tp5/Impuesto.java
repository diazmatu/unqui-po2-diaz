package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	
	private float tasaDelServicio;

	public Impuesto(float tasaDelServicio) {
		super();
		this.setTasaDelServicio(tasaDelServicio);
	}

	public float getTasaDelServicio() {return tasaDelServicio;}

	public void setTasaDelServicio(float tasaDelServicio) {this.tasaDelServicio = tasaDelServicio;}

}
