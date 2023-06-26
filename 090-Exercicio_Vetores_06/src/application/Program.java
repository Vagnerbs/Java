package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em
		 * seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
		 * elementos correspondentes de A e B. Imprima o vetor C gerado.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();

		double[] vetorA = new double[n];
		double[] vetorB = new double[n];
		double[] soma = new double[n];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextDouble();
		}

		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextDouble();
		}

		for (int i = 0; i < soma.length; i++) {
			soma[i] = vetorA[i] + vetorB[i];
		}

		System.out.println("Vetor resultante: ");
		for (int i = 0; i < soma.length; i++) {
			System.out.printf("%.0f %n", soma[i]);
		}

		sc.close();
	}

}
