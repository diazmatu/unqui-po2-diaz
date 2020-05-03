package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	
	public ArrayList<Ingreso> ingresos;
	public float porcentajeImpuestoMontoImponible;
	
	public Trabajador() {
		this.ingresos = new ArrayList<Ingreso>();
		this.porcentajeImpuestoMontoImponible = 0.02f;
	}

	public ArrayList<Ingreso> getIngresos() {
		return ingresos;
	}

	public void agregarIngreso(Ingreso ingreso) {
		this.getIngresos().add(ingreso);
	}
	
	public boolean tieneIngresos() {
		return (this.getIngresos() != null);
	}

	public float getTotalPercibido() {
		float totalPercibido = 0;
		if(this.tieneIngresos()) {
			for (Ingreso ingreso:this.ingresos) {
				totalPercibido = totalPercibido + ingreso.getMonto();
			}
		}
		return totalPercibido;
	}

	public float getMontoImponible() {
		float totalImponible = 0;
		if(this.tieneIngresos()) {
			for (Ingreso ingreso:this.ingresos) {
				totalImponible = totalImponible + ingreso.getMontoImponible();
			}
		}
		return totalImponible;
	}

	public float getImpuestoAPagar() {
		float totalImpuestoAPagar = 0;
		if(this.tieneIngresos()) {
			for (Ingreso ingreso:this.ingresos) {
				totalImpuestoAPagar = totalImpuestoAPagar + this.calcularMontoImpuesto(ingreso.getMontoImponible());
			}
		}
		return totalImpuestoAPagar;
	}

	private float calcularMontoImpuesto(float montoImponible) {
		return montoImponible * this.porcentajeImpuestoMontoImponible;
	}
	
}
