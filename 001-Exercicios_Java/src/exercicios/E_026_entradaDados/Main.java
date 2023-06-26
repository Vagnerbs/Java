package exercicios.E_026_entradaDados;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		String s1, s2, s3;
		
		// Obs: Aqui usamos "nextLine", pois ele lê o texto todo, e não só a primeira palavra.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		*/
		
		/*OBS: SE PRECISARMOS ENTRAR COM OUTRO TIPO DE DADOS ANTES DO NEXTLINE, DEVEMOS COLOCAR UM NEXTLINE VAZIO
		 * ENTRE ELES PARA CONSUMIR A VAZIO QUE FICARÁ DA LINHA ANTERIOR, PRECISAMOS FAZER ISSO PARA CORRIGIR
		 * O PROBLEMA COMO NO EXEMPLO ABAIXO
		*/
		
		int x;
		String A1, A2, A3;
		
		
		x = sc.nextInt();
		
		// Obs: Aqui usamos "nextLine", pois ele lê o texto todo, e não só a primeira palavra.
		sc.nextLine();// Está linha é o que vai corrigir o problema, pode tirar para fazer o teste
		
		A1 = sc.nextLine();
		A2 = sc.nextLine();
		A3 = sc.nextLine();
		
		System.out.println("Dados Digitados: ");
		System.out.println(x);
		System.out.println(A1);
		System.out.println(A2);
		System.out.println(A3);
		
		sc.close();

	}

}
