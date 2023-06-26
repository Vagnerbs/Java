package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Integer> numeros = new ArrayList<>();
		
		
		char resp = 's';
		
		while(resp == 's' || resp == 'S') {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			numeros.add(num);
			System.out.print("Digite s/n: ");
			resp = sc.next().charAt(0);
		}
		
		double soma = 0;
		for (int i=0; i < numeros.size(); i++) {
			soma += numeros.get(i);
		}
		
		System.out.printf("A soma %.2f", soma);
		sc.close();		
	}
}
