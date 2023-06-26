import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 5 - Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
		 * Em seguida, calcule e mostre:
         * a) a área do triângulo retângulo que tem A por base e C por altura.
         * b) a área do círculo de raio C. (pi = 3.14159)
         * c) a área do trapézio que tem A e B por bases e C por altura.
         * d) a área do quadrado que tem lado B.
         * e) a área do retângulo que tem lados A e B.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, at, ac, atrap, aq, ar;
		final double pi = 3.14159;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		at = (a * c ) / 2;
		ac = pi * (c * c);
		atrap = ((a + b) * c) / 2;
		aq = b * b;
		ar = a * b;
		
		System.out.printf("TRIANGULO: %.3f %n", at);
		System.out.printf("CIRCULO: %.3f %n", ac);
		System.out.printf("TRAPEZIO: %.3f %n", atrap);
		System.out.printf("QUADRADO: %.3f %n", aq);
		System.out.printf("RETANGULO: %.3f %n", ar);
		
		sc.close();

	}

}
