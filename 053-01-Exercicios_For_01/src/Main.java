import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, 
		 * inclusive o X, se for o caso.
		 */
		
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		
		for(int i = 0; i <= x; i ++) {
			
			if(i % 2 == 1) {
				System.out.println(i);
			}
			
		}
		
		
		
		sc.close();

	}

}
