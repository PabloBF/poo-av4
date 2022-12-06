package forma;

public abstract class Forma {
	private int numLados;
	
	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	
	public abstract double getArea();
	public abstract double getPerimetro();
	
	Forma(int numLados) {
		this.numLados = numLados;
	}
}
