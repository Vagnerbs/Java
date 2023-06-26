import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* - FUNÇÕES -
		 * Representam um processamento que possui um significado.
		 *   Math.sqrt(double) -  ex.: sqrt é uma operação que possui um significado e já fica 
		 * disponibilizada, existe uma funçaõ para ela, e podemos usar quantas vezes for necessário, 
		 * essa função já foi criada pelos desenvolvedores do próprio java.
		 *   System.out.println(String) - ex.: println, que recebe uma String como 
		 * argumento, essa função é responsável por mostrar ou imprimir algo na tela. 
		 */
		
		/*Principais vantagens: 
		 * Modularização - Divide seu programa em varías partes varios módulos.
		 * Delegação - Você delega o lógica de ex. calcular alguma coisa, pra outro lugar.
		 * Reaproveitamento - Você pode reaproveitar uma função varias vezes. 
		 */
		
		/* - Dados de entrada e saída - 
		 * Funções podem receber dados de entrada (parâmetro ou argumentos)
		 * funções podem ou não retornar uma saída
		 */
		
		// Em orientação a objetos, funções em classes recebem o nome de "métodos"
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a,b,c); // Aqui chamei uma função - Função, quando tem retorno
		
		showResult(higher); // Aqui chamei um procedimento - Procedimento, quando não tem retorno
		
		sc.close();
	}
	
	// FUNÇÃO
	public static int max(int a, int b, int c) {
		
		int aux;
		
		if(a > b && a > c) {
			aux = a;
		}
		
		else if( b > c ) {
			aux = b;
		}
		
		else {
			aux = c;
		}
		
		return aux;		
	}
	
	//PROCEDIMENTO
	public static void showResult(int higher) {
		System.out.println("Higher = " + higher);
	}

}
