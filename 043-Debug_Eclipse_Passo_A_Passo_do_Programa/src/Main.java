import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Nesta aula foi explicado como se executa o programa passo a passo
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area =  largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preco = %.2f%n", preco);
			
		sc.close();
		
	}
}
