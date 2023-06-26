package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. 
		 *Fazer um programa que calcule e escreva a maior e a menor altura do grupo, 
		 *a média de altura das mulheres, e o número de homens.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		double somaAltura = 0;
		int homens = 0;
		double menorAltura = 0;
		double maiorAltura = 0;
		
		for(int i=0; i < n; i++) {
			
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			somaAltura += altura[i];
			
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
			if(genero[i] == 'm' || genero[i] == 'M') {
				homens += 1;
			}
		}	
		double media = somaAltura/ n;
		
		menorAltura = altura[0];
		maiorAltura = altura[0];
		for(int i=0; i < n; i++) {
			
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			if(altura[i] > maiorAltura){
				maiorAltura = altura[i];
			}
		}
		
		System.out.printf("Menor altura %.2f %n", menorAltura);
		System.out.printf("Maior altura %.2f %n", maiorAltura);
		System.out.printf("Média das alturas das mulheres %.2f %n", media);
		System.out.println("Numero de Homens = " + homens);
		sc.close();
	}

}
