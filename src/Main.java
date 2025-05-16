import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	static float calcularDistanciaDoisPontos(
			float eixoX1, float eixoY1, 
			float eixoX2, float eixoY2) {
		return (float) (Math.sqrt(Math.pow((eixoX2 - eixoX1), 2) + Math.pow((eixoY2 - eixoY1), 2)));
	}
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float x1 = sc.nextFloat();
		float y1 = sc.nextFloat();
		
		float x2 = sc.nextFloat();
		float y2 = sc.nextFloat();
		
		System.out.printf("%.4f\n", calcularDistanciaDoisPontos(x1, y1, x2, y2));
		
		sc.close();
	}
}
