package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {
	/* Fazer um programa para ler os valores da largura e altura de um retângulo.
	 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
	 * Usar uma classe como mostrado no projeto.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f %n", rectangle.Area());
		System.out.printf("PERIMETER = %.2f %n", rectangle.Perimeter());
		System.out.printf("DIAGONAL = %.2f %n", rectangle.Diagonal());
		
		sc.close();
	}

}
