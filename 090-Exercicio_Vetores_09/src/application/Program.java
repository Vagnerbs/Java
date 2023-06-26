package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
		 * idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro
		 * vetor. Depois, mostrar na tela o nome da pessoa mais velha.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();

		String[] nome = new String[n];
		double[] idade = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a Pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.next();

			System.out.print("Idade: ");
			idade[i] = sc.nextDouble();
		}

		double maior = idade[0];
		int maisVelha = 0;

		for (int i = 0; i < n; i++) {

			if (idade[i] > maior) {
				maior = idade[i];
				maisVelha = i;
			}
		}

		System.out.println("PESSOA MAIS VELHA: " + nome[maisVelha]);
		sc.close();
	}
}
