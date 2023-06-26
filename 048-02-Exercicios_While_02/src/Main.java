import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 2 - Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		 * menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		 */
		
		Scanner sc  = new Scanner (System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0 ) {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");			
				x = sc.nextInt();
				y = sc.nextInt();				
			}
			
			else if (x < 0 && y > 0) {
				System.out.println("Segundo");			
				x = sc.nextInt();
				y = sc.nextInt();				
			}
			
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");				
				x = sc.nextInt();
				y = sc.nextInt();			
			}
			
			else if (x > 0 && y < 0) {
				System.out.println("Quarto");				
				x = sc.nextInt();
				y = sc.nextInt();				
			}
		} 		
		sc.close();		
	}		
}
