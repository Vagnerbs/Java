package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		 *- Imprimir todos os elementos do vetor
		 *- Mostrar na tela a soma e a média dos elementos do vetor
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		double soma = 0;
		double media = 0;
		double[] vetor = new double[n];
		
		for(int i=0; i < vetor.length;i++) {
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
			media = soma / vetor.length;
		}
		
		System.out.print("Valores = ");
		for(int i=0; i < vetor.length; i++) {
			System.out.printf("%.1f ", vetor[i]);
			
		}
			
		System.out.printf("%nSoma = %.2f %n", soma);
		System.out.printf("Média = %.2f", media);
		sc.close();
	}
}
