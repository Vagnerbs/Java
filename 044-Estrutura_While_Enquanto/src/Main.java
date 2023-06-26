import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Usada quando não se sabe previamente a quantidade de repetições que será realizada.
		
		/* Fazer um programa que lê números inteiros  até que um zero seja lido.
		 * Ao final mostrar a soma dos números lidos.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int soma = 0;
		int num; 
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		while(num != 0) {
			
			soma += num;
			
			System.out.print("Digite um número: ");
			num = sc.nextInt();
		}
		
		System.out.print(soma);
		
		sc.close();
		
	}

}
