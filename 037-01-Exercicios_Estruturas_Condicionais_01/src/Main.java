import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 1 - Uma operadora de telefonia cobra R$50.00 por um plano basico que da direito a 100 minutos de telefone.
		 * Cada minuto que exceder a franquia de 100 minutos custa R$2.00. Fazer um programa para ler a quantidade
		 * de minutos que uma pessoa consumiu, dai mostrar o valor a ser pago.
		 */
		
		Scanner sc = new Scanner (System.in);
			
		int min = sc.nextInt();
		
		double conta = 50;
		
		if(min > 100){
			
			conta += ((min - 100) * 2);
		
		}
		System.out.printf("Valor a pagar: R$%.2f", conta);
		
		sc.close();

	}

}
