package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		/* Faça um programa para ler a cotação do dólar, e depois um valor em dólares
		 * a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar
		 * pelos dólares, considerando que ainda a pessoa terá que pagar 6% de IOF sobre o valor
		 * em dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos.  
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("What is the dollar price? ");//Qual é o preço do dólar?
		double price = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");//Quantos dólares serão comprados?
		double bought = sc.nextDouble();
			
		double p = CurrencyConverter.price(price, bought);
		double iof = CurrencyConverter.iof(p);
		
		System.out.printf("Amount to be paid in reais = %.2f", iof); //Valor a ser pago em reais
		
		sc.close();
		
	}

}
