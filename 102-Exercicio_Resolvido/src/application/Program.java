package application;

import java.util.Scanner;

public class Program {
	/*
	 * Fazer um programa para ler um número inteiro N e uma matriz de ordem N
	 * contendo números inteiros. Em seguida, mostrar a diagonal principal e a
	 * quantidade de valores negativos da matriz
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i=0; i < mat.length; i++) { //Percorre as linhas. 		
			for(int j=0; j < mat[i].length; j++) { //Percorre as colunas.
				mat[i][j] = sc.nextInt();	
			}
		}
		
		System.out.println("Main diagonal: ");// Diagonal principal
		for(int i=0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
				
		System.out.println("Negative numbers: "); // Números negativos
		int count=0;	
		for(int i=0; i < n; i++) {
			for(int j=0; j < n; j++) {
				if(mat[i][j] < 0) {
				count ++;
				System.out.print(mat[i][j] + " ");
				}
			}
		}
		
		System.out.println();
		System.out.println("Amount of negative numbers = " + count);//Quantia de números negativos
		sc.close();
	}

}
