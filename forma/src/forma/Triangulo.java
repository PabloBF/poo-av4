package forma;

public class Triangulo extends Forma {
	
	private double base;
	private double altura;
	private double angulo;

	@Override
	public double getArea() {
		return base * altura / 2;
	}

	@Override
	public double getPerimetro() {
		// Foi considerado o perímetro de um triângulo retângulo com o ângulo reto na base.
		return base + altura + Math.sqrt(base*base + altura*altura);
	}
	
	public double getPerimetroAlt() {
		// Foi considerado o perímetro de um triângulo retângulo com o ângulo reto fora da base.
		if(base == 2 * altura) return base * (1 + Math.sqrt(2));
		else return getPerimetro();
	}
	
	public double getPerimetroAlt2() {
		// Calculo do perímetro pelo ângulo da base
		return base + altura/Math.sin(angulo) + Math.sqrt(Math.pow(altura / Math.tan(angulo) - base, 2) + altura * altura);
	}
	
	@Override
	public String toString() {
		return "Triângulo (área: " + getArea() + " u.a.; perimetro: " + getPerimetro() + " u.";
	}
	
	public Triangulo(double base, double altura, double angulo) {
		super(3);
		this.base = base;
		this.altura = altura;
		this.angulo = Math.toRadians(angulo);
	}
	
	public Triangulo(double base, double altura) {
		this(base, altura, 90);
	}
}
