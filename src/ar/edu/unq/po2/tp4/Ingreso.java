package ar.edu.unq.po2.tp4;

public class Ingreso {
	
	private String mes;
	private String concepto;
	private float monto;

	public Ingreso(String mes, String concepto, int monto) {
		this.setMes(mes);
		this.setConcepto(concepto);
		this.setMonto(monto);
	}
	
	public Ingreso(String mes, int monto) {
		this.setMes(mes);
		this.setConcepto("");
		this.setMonto(monto);
	}

	public String getMes() {return mes;}
	public void setMes(String mes) {this.mes = mes;}

	public String getConcepto() {return concepto;}
	public void setConcepto(String concepto) {this.concepto = concepto;}

	public float getMonto() {return monto;}
	public void setMonto(float monto) {this.monto = monto;}

	public float getMontoImponible() {return this.getMonto();}

}
