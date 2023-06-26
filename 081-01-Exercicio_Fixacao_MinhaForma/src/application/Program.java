package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Digite o número da conta: ");
		int numConta = sc.nextInt();
		
		System.out.println("Digite o nome do titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Existe um depósito inicial (s/n)");
		char resp = sc.next().charAt(0);
		
		if (resp == 's') {
			System.out.println("Digite o valor do depósito: $");
			double depInicial = sc.nextDouble();
			conta = new Conta(numConta, nome, depInicial);
		}
		else {
			conta = new Conta(numConta, nome);
		}
		
		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Insira o valor do depósito $");
		double valorDeposito = sc.nextDouble();
		conta.setSaldo(valorDeposito);//Deposito através do método set.
		System.out.println("Dados Atualizados");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Insira o valor do saque $");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);//Saque feito através de uma classe.
		System.out.println("Dados Atualizados");
		System.out.println(conta);
		
		
		sc.close();
	}

}
