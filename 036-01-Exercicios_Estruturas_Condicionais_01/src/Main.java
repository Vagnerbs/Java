import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1 - Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um numero: ");
		num = sc.nextInt();
		
		if(num >= 0){
			System.out.println("NÃO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();

	}

}
