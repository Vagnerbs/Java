package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
		 * seguida, mostre na tela todos os números pares, e também a quantidade de
		 * números pares.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();

		int[] numeros = new int[n];
		int pares = 0;

		for (int i = 0; i < numeros.length; i++) {

			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
			sc.nextLine();

			if (numeros[i] % 2 == 0) {
				pares += 1;
			}
		}

		System.out.println("\nNumeros pares: ");

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
			}
		}

		System.out.println("\n\nQuantia de pares = " + pares);

		sc.close();
	}

}
