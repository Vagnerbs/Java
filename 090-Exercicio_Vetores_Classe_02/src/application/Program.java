package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculos;

public class Program {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
		 * média dos elementos do vetor
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Calculos[] vetnumeros = new Calculos[n];
		Calculos somando = new Calculos(0, 0);

		for (int i = 0; i < vetnumeros.length; i++) {
			//double numeros = sc.nextDouble();
			vetnumeros[i] = new Calculos(sc.nextDouble(), 0);
			
		}

		for (int i = 0; i < vetnumeros.length; i++) {
			//double somar = vetnumeros[i].getNumeros();
			somando.setSoma(vetnumeros[i].getNumeros());
			System.out.println(vetnumeros[i].getNumeros());
		}

		// Tentar colocar dentro de outra classe futuramente
		double media = somando.getSoma() / vetnumeros.length;

		System.out.println(somando.getSoma());
		//double soma2 = somando.getSoma();
		System.out.printf("%.2f ", media);
		sc.close();

	}

}
