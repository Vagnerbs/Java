package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*A dona de um pensionato possui dez quartos para alugar para estudantes, 
		 *sendo esses quartos identificados pelos numeros de 0 a 9.
		 *
		 *Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantia N
		 *representando o número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida,
		 *registre o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome e email 
		 *do estudante, bem como qual dos quartos ele escolheu(de 0 a 9). Suponha que seja escolhido 
		 *um quarto vago. Ao final, seu programa deve imprimir um relatório de todas ocupações de 
		 *pensionato, por ordem de quarto, conforme exemplo. 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] nome = new String[10];
		String[] email = new String[10];
		
		System.out.print("Quantos quartos deseja alugar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i <= n; i++) {
			System.out.println("Dados do "+ i + "° quarto: ");
			
			System.out.print("Nome: ");
			String nome1 = sc.nextLine();
			
			System.out.print("E-mail: ");
			String email1 = sc.next();
			
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			nome[quarto] = nome1;
			email[quarto] = email1;
			sc.nextLine();
		}
		
		
		for(int i=1; i < nome.length; i++) {
			if(nome[i] != null) {
				System.out.println("Nome: " + nome[i] + ", Email: " + email[i] + ", Quarto: " + i + " !");
			}
		}		
		sc.close();

	}

}
