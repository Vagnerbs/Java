package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida, mostrar na tela o maior número do vetor (supor não haver empates).
		 * Mostrar também a posição do maior elemento, considerando a primeira posição
		 * como 0 (zero).
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros vai digitar: ");
		int n = sc.nextInt();

		double[] numeros = new double[n];
		double maior = 0;
		int posicao = 0;

		for (int i = 0; i < numeros.length; i++) {

			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();

			if (numeros[i] > maior) {
				maior = numeros[i];
				posicao = i;
			}

		}

		/*
		 * for (int i=0; i < numeros.length; i++) {
		 * 
		 * 
		 * }
		 */

		System.out.print("Maior valor: " + maior);
		System.out.println("\nPosiçao do maior valor: " + posicao);

		sc.close();

	}

}
