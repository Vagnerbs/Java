import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 5 - Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
		 * A seguir, calcule e mostre o valor da conta a pagar
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd;
		double total;
		
		cod = sc.nextInt();
		qtd = sc.nextInt();
		
		if(cod == 1) {
			total = qtd * 4.00;
		}
		else if(cod == 2) {
			total = qtd * 4.50;
		}
		
		else if(cod == 3) {
			total = qtd * 5.00;
		}
		
		else if (cod == 4) {
			total = qtd * 2.00;
		}
		
		else {
			total = qtd * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();
	}
}
