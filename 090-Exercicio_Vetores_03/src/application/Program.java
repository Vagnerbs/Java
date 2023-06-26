package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*Fazer um programa para ler nome, idade e altura de N pessoas, 
		 *conforme exemplo. Depois, mostrar na tela a altura média das pessoas, 
		 *e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes 
		 *dessas pessoas caso houver.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("How many people will be typed?");//Quantas pessoas serão digitadas?
		int n = sc.nextInt();
		sc.nextLine();//Consumir quebra de linha
		
		String[] name = new String [n];
		int[] idade = new int[n];		
		double[] altura = new double[n];
		double media = 0;
		int quantia = 0;
		
		//int m = 0;
		//String nomeMenores[] = new String[];
		
		
		for (int i=0; i < n; i++) {
			
			System.out.printf("Dados da " + (i+1) + "a pessoa %n");//First person data			
			System.out.print("Nome : ");
			name[i] = sc.next();
			
			System.out.print("Idade : ");
			idade[i] = sc.nextInt();
			sc.nextLine();// Consome quebra de linha nextInt
						
			System.out.print("Height : ");
			altura[i] = sc.nextDouble();
			media += altura[i];
			
			if (idade[i] < 16) {
				quantia += 1;
			}
		}
				
		double altMedia = media / altura.length;
		double porcMenores = (quantia * 100) / idade.length;
			
		System.out.printf("Altura média: %.2f%% %n", altMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", porcMenores); //%% para colocar % na resposta
		
		for (int i=0; i < idade.length; i++) {
			if(idade[i] < 16) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();
	}
}
