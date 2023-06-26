package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Numbers;

public class Program {

	public static void main(String[] args) {
		/*Faça um programa que leia um número inteiro positivo N (máximo = 10) 
		 * e depois N números inteiros e armazene-os em um vetor. 
		 * Em seguida, mostrar na tela todos os números negativos lidos. 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		if (n > 10) {          //Digite um número menor ou igual a 10
			System.out.println("Enter a number less than or equal to 10!");
			n = sc.nextInt();
		}
		Numbers[] numeros = new Numbers[n];
		
		for (int i=0; i < numeros.length; i++) {
			sc.nextLine();
			//double num = sc.nextDouble();
			numeros[i] = new Numbers(sc.nextDouble());
		}
		
		for (int i=0; i < numeros.length; i++) {
			if(numeros[i].getNum() < 0) {
				System.out.println(numeros[i].getNum());
			}
		}
		sc.close();

	}

}
