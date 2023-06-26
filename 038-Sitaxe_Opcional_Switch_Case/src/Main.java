import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 1 - Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana
		 * (sendo 1=Domingo, 2=Segunda, e assim por diante).
		 * Escrever na tela o dia da semana correspondente, conforme exemplos.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		String dia;
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Valor Inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		
		
		
		sc.close();

	}

}
