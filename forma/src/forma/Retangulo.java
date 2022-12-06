package forma;

public class Retangulo extends Forma implements Redimensionavel {
	
	private double largura;
	private double altura;

	@Override
	public double getArea() {
		return largura * altura;
	}

	@Override
	public double getPerimetro() {
		return 2 * (largura + altura);
	}

	public void redimensionar(double x) {
		largura *= x;
		altura *= x;
	}
	
	public Retangulo(double largura, double altura) {
		super(4);
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Retângulo (área: " + getArea() + " u.a.; perimetro: " + getPerimetro() + " u.";
	}
}
