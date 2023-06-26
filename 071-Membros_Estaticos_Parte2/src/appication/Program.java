package appication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

///import util.Calculator;

public class Program {
	
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		/*Calculator calc = new Calculator();Não preciso fazer a instânciação usando static em Calculator.
		 Neste caso estarei usando membros estáticos assim como na minha classe principal, sendo
		 assim posso chamar meus métodos atravéz do nome da classe de forma direta.*/
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f %n", c);
		System.out.printf("Volume: %.2f %n", v);
		System.out.printf("PI value: %.2f %n", Calculator.PI);
		
		sc.close();

	}

}
