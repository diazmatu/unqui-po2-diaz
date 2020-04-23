package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	private Punto punto;
	private float largo;
	private float alto;
	
	public Rectangulo(Punto puntoX, float altoX, float largoX) {
		this.setPunto(puntoX);
		this.setAlto(altoX);
		this.setLargo(largoX);
	}


	public Punto getPunto() {
		return punto;
	}

	public void setPunto(Punto punto) {
		this.punto = punto;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}
	
	public float perimetro() {
		return (this.alto*2 + this.largo*2);
	}
	
	public float area() {
		return (this.alto*this.largo);
	}
	
	public String horizontalOVertical() {
		String forma = "vertical";
		if(this.alto > this.largo)
			forma = "Horizontal";
		return forma;
	}
	
}
