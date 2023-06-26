package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
		 * notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve
		 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
		 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0
		 * (seis).
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados?");
		int n = sc.nextInt();
		sc.nextLine();

		String[] nomes = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		double[] media = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "a aluno: ");
			nomes[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
			sc.nextLine();
		}

		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < n; i++) {

			media[i] = (nota1[i] + nota2[i]) / 2;

			if (media[i] >= 6) {
				System.out.printf("%s %n", nomes[i]);
			}
		}
		sc.close();
	}

}
