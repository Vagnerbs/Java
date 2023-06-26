import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 3 - Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem 
		 *"Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
		 *Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1 % 2 == 0 && n2 % 2 == 0) {
			System.out.println("São Multiplos");
		}else {
			System.out.println("Não São Multiplos");
		}
		sc.close();
	}

}
