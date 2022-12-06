package forma;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo(2, 3);
		Triangulo t1 = new Triangulo(3, 4);
		int fator = 2;
		ArrayList<Forma> formas = new ArrayList<>();
		
		System.out.println("Área do retângulo: " + r1.getArea() + " u.a.");
		System.out.println("Perímetro do retângulo: " + r1.getPerimetro() + " u.");
		System.out.println("----------\n");
		
		r1.redimensionar(fator);
		System.out.println("Retângulo redimensionado pelo fator " + fator + ".");
		System.out.println("----------\n");
		
		System.out.println("Área do retângulo: " + r1.getArea() + " u.a.");
		System.out.println("Perímetro do retângulo: " + r1.getPerimetro() + " u.");
		System.out.println("----------\n");
		
		formas.add(r1);
		formas.add(t1);
		
		System.out.println("** Áreas e perímetros das formas no ArrayList: **");
		
		for (Forma forma : formas) {
			if(forma instanceof Redimensionavel) {
				((Redimensionavel) forma).redimensionar(0.5);
			}
			System.out.println("Área da forma: " + forma.getArea() + " u.a.");
			System.out.println("Perímetro da forma: " + forma.getPerimetro() + " u.");
			System.out.println("----------\n");
		}	
	}
}
