import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 2 - Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		
		Scanner sc = new Scanner(System.in);
		
		
		int n1;
		
		n1 = sc.nextInt();
		
		if(n1 % 2 == 0){
			System.out.println("PAR");	
		}
		else {
			System.out.println("IMPAR");	
		}
		sc.close();
	}
		

}
