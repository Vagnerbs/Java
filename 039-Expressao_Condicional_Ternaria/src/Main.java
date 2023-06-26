import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 
		// USANDO IF - ELSE
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double preco = 34.5;
		double desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;	
		}
		else {
			desconto = preco * 0.05;
		}
		
		System.out.println(desconto);
		
		sc.close();
		*/
		
		// USANDO CONDICAO TERNARIA
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
			  //condicao se(preco < 20) (se sim = ?) preco * 0.1 (senao = :) preco * 0.05;
		
		System.out.println(desconto);
		
		sc.close();
		
	}

}
