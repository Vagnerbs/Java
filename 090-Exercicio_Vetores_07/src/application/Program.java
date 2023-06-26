package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. 
		 *Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais. 
		 *Depois mostrar todos os elementos do vetor que estejam abaixo da média, 
		 *com uma casa decimal cada. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos o vetor vai ter? ");
		int n = sc.nextInt();
		double soma = 0;
		
		double[] numeros = new double[n];
		
		for(int i=0; i < numeros.length; i++) {
			numeros[i] = sc.nextDouble();
			soma += numeros[i];
		}
		
		double media = soma / numeros.length;		
		System.out.printf("Média do Vetor: %.3f", media);
		
		System.out.println("\nElementos abaixo da média: ");
		for (int i=0; i < numeros.length; i++) {
			if(numeros[i] < media) {
				System.out.printf("%.1f %n",numeros[i]);
			}
		}		
		sc.close();	
	}
}
