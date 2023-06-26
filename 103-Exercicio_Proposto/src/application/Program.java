package application;

import java.util.Scanner;

public class Program {
	/*
	 * Fazer um programa para ler dois números inteiros M e N, e depois ler uma
	 * matriz de M linhas por N colunas contendo números inteiros, podendo haver
	 * repetições. Em seguida, ler um número inteiro X que pertence á matriz. Para
	 * cada ocorrência de x, mostrar os valores á esquerda, acima, á direita e
	 * abaixo de x, quando houver, conforme exemplo.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero de linhas: ");
		int m = sc.nextInt();

		System.out.print("Digite o numero de colunas: ");
		int n = sc.nextInt();

		int[][] matriz = new int[m][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.print("Digite um número que pertence a matriz: ");
		int x = sc.nextInt();

		// System.out.println("Position: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] == x) {

					System.out.println("Position " + i + "," + j + ":");

					if (j > 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}

					if (i > 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}

					if (j < matriz[i].length - 1) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}

					if (i < matriz.length - 1) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}
			}
		}
		sc.close();

	}

}
