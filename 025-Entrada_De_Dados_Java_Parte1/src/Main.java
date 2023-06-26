import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);// Este paramêtro é para trabalharmos com ponto e não virgula quando trabalhamos com "Double",
		//quando fazemos essa chamada usamos o padrão americano.
		
		Scanner sc = new Scanner(System.in);
		
		//String x;
		//int y;
		//double z;
		//char k;
		
		// Aqui recebemos uma String, Obs.: No caso do "next", ele lê apenas uma palavra e não um texto por exemplo.
		//x = sc.next();
		//System.out.println("Você digitou: " + x);
		
		// Aqui recebemos um inteiro
		//y = sc.nextInt();
		//System.out.println("Você digitou: " + y);
		
		// Aqui recebemos números com ponto flutuante
		//z = sc.nextDouble();
		//System.out.println("Você digitou: " + z);
		
		// Aqui determinamos qual caractere desejamos receber da String, nesse caso estamos recebendo o 1°
		//k = sc.next().charAt(0);
		//System.out.println("Você digitou: " + k);
		
		
		// Recebendo dados de tipos diferentes, separados por espaço
		String a;
		int b;
		double c;
		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close(); // Aqui fechamos a variavél responsável pela leitura da entrada dos dados através do Scanner

	}

}
