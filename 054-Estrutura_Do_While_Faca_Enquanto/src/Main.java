import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Nessa estrutura o bloco é executado pelo menos uma vez, porque sua condição e testada apenas no final.
		
		/* Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit.
		 * Perguntar se o usuario deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
			
			System.out.println("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			
			double f = 9.0 * c / 5.0 + 32;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			
			System.out.println("Deseja repetir (S/N)? ");
			resp = sc.next().charAt(0);
		
		} while (resp != 'n');
		sc.close();
	}
}
