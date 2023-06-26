import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Usada quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.
		
		/* Fazer um programa que leia um valor inteiro N e depois N números inteiros.
		 * Ao final, mostra a soma dos N números lidos.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		
		for ( int i = 0; i < N; i ++) {
			
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		sc.close();
	}
}
