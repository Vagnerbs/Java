import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 4 - Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
		 * o valor que recebe por hora e calcula o salário desse funcionário. A seguir, 
		 * mostre o número e o salário do funcionário, com duas casas decimais.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		double horas, valor, soma;
		
		
		num = sc.nextInt();
		
		horas = sc.nextDouble();
		valor = sc.nextDouble();
		
		soma = horas * valor;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f", soma);
		
		sc.close();

	}

}
