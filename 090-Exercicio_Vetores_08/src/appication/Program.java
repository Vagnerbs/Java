package appication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um vetor de N números inteiros. Em seguida,
		 * mostrar na tela a média aritmética somente dos números pares lidos, com uma
		 * casa decimal. Se nenhum número par for digitado, mostrar a mensagem
		 * "NENHUM NUMERO PAR".
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vator?");
		int n = sc.nextInt();

		int[] numeros = new int[n];
		int somaPares = 0;
		int qNumeros = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();

			if (numeros[i] % 2 == 0) {
				somaPares += numeros[i];
				qNumeros += 1;
			}

		}

		if (qNumeros == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			double media = somaPares / qNumeros;
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		}
		sc.close();
	}

}
