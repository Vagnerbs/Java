import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 4 - Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
		 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"
		 */
		
		Scanner sc = new Scanner (System.in);
		
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i ++) {
			
			double numerador = sc.nextDouble();
			double denominador = sc.nextDouble();
			
			if (denominador == 0 ) {
				System.out.println("Divisao impossível");	
			}
			
			else {
				double divisao = numerador / denominador;
				System.out.println(divisao);
			}
		}	
		sc.close();		
	}
}
