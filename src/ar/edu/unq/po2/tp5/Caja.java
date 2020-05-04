package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Caja {
	
	private ArrayList<ElementoCobrable> lista;
	private float cuentaTotal;
	
	public Caja() {
		lista = new ArrayList<ElementoCobrable>();
		this.setCuentaTotal(0);
		this.setLista(lista);
	}

	public Caja(ArrayList<ElementoCobrable> lista) {
		this.setCuentaTotal(0);
		this.setLista(lista);
	}

	public ArrayList<ElementoCobrable> getLista() {return lista;}
	public void setLista(ArrayList<ElementoCobrable> lista) {this.lista = lista;}

	public float getCuentaTotal() {return cuentaTotal;}
	public void setCuentaTotal(float cuentaTotal) {this.cuentaTotal = cuentaTotal;}

	public void registrarProducto(ElementoCobrable producto) {
		this.lista.add(producto);
		this.agregarACuenta(producto.getPrecio());
	}

	private void agregarACuenta(float precio) {
		this.cuentaTotal = this.cuentaTotal + precio;
	}

	public void registrarProductos(ArrayList<ElementoCobrable> listaX) {
		for(ElementoCobrable p:listaX) {
			this.registrarProducto(p);
		}	
	}
}
