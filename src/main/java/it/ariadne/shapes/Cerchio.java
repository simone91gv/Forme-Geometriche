package it.ariadne.shapes;

public class Cerchio implements Forma {

	private Punto p;
	private int raggio;
	
	public Cerchio(Punto p, int raggio) {
		this.p = p;
		this.raggio = raggio;
	}

	@Override
	public double calcolaPerimetro() {
		return 2*3*this.raggio;
	}

	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double getDiametro(){
		return raggio*2;
	}

}
