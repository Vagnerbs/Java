import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 1 - Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		 * mensagem explicativa, conforme exemplos.
		 */
		
		Scanner dados = new Scanner(System.in);
		
		int a, b, s;
		
		a = dados.nextInt();
		b = dados.nextInt();
		
		s = a + b;
		
		
		System.out.println("SOMA = " + s);
		
		dados.close();

	}

}
