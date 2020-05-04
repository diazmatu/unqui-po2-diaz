package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
	
	private float costoPorUnidad;
	private int cantidadDeUnidades;
	
	public Servicio(float costoPorUnidad, int cantidadDeUnidades) {
		this.setCostoPorUnidad(costoPorUnidad);
		this.setCantidadDeUnidades(cantidadDeUnidades);
	}
	
	public float getCostoPorUnidad() {return costoPorUnidad;}
	public void setCostoPorUnidad(float costoPorUnidad) {this.costoPorUnidad = costoPorUnidad;}
	
	public int getCantidadDeUnidades() {return cantidadDeUnidades;}
	public void setCantidadDeUnidades(int cantidadDeUnidades) {this.cantidadDeUnidades = cantidadDeUnidades;}
	
	@Override
	public float getPrecio() {
		this.setPrecio(this.getCostoPorUnidad() * this.getCantidadDeUnidades());
		return this.getPrecio();
	}

}
