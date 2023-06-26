package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*Faça um programa que leia um número inteiro positivo N (máximo = 10) 
		 * e depois N números inteiros e armazene-os em um vetor. 
		 * Em seguida, mostrar na tela todos os números negativos lidos. 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How many numbers you go enter: ");// Quantos numeros voce vai entrar
		int n = sc.nextInt();
		
		if (n > 10) {          //Digite um número menor ou igual a 10
			System.out.println("Enter a number less than or equal to 10!");
			n = sc.nextInt();
		}
		int[] num = new int[n];
			
		for (int i=0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println("Negatives numbers: "); // Numeros negativos
		for (int i=0; i < num.length; i++) {
			if(num[i] < 0)
			System.out.println(num[i]);
		}
		
		sc.close();
	}
}
