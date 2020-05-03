package ar.edu.unq.po2.tp4;

public class HorasExtra extends Ingreso {

	public HorasExtra(String mes, String concepto, int monto) {
		super(mes, concepto, monto);
		// TODO Auto-generated constructor stub
	}

	public HorasExtra(String mes, int monto) {
		super(mes, monto);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public float getMontoImponible() {return 0;}
}
