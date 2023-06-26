package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/* Fazer um programa para ler as medidas dos lados de um triângulo x e y,
		 * (suponha medidas válidas). Em seguida mostrar o valor das áreas dos dois triângulos
		 * e dizer qual dos dois triângulos possui maior área.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xa, xb, xc, ya, yb, yc;
		
		System.out.println("Enter the measures of triângle X: "); // Digite as medidas do triângulo x
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		
		System.out.println("Enter the measures of triângle Y: "); // Digite as medidas do triângulo x
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		
		double p = (xa + xb + xc) / 2.0;
		double areaX = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));
		
		p = (ya + yb + yc) / 2.0;
		double areaY = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));
		
		System.out.printf("Triângle X area: %.4f%n", areaX);
		System.out.printf("Triângle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
				
		sc.close();
	}
}


