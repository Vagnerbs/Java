import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 1 - Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		 * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		 * */
			
		Scanner sc = new Scanner (System.in);
		
		int senha  = 2002;
		int num = sc.nextInt();
		
		while (num != senha) {
			System.out.println("Senha Inválida!");
			
			System.out.println("Digite novamente: ");
			num = sc.nextInt();			
		}
		
		System.out.println("Acesso Permitido!");
		
		sc.close();
	}
}
