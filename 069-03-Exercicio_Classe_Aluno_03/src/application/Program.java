package application;

import java.util.Locale;
import java.util.Scanner;

import entitie.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f %n", aluno.notaFinal());
		
		if (aluno.notaFinal() >= 60 ) {			
			System.out.println("PASS");
		}
		else {				
			System.out.printf("FAILED %n");
			System.out.printf("MISSING %.2f POINTS %n", aluno.missingPoints());
		}
		
		sc.close();
	}

}
