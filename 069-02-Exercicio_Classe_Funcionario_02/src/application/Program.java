package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {
	/* Fazer um programa para ler dados de um funcionário (nome, salário bruto e imposto).
	 * Em seguida, mostrar os dados do funcionário com base em uma porcentagem dada
	 * (somente salário bruto é afetado pela porcentagem) e mostrar novamente os dados so 
	 * funcionário. Use a classe projetada abaixo.
	 * */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Employee emplo = new Employee();
		Scanner sc = new Scanner (System.in);
		System.out.println("Name: ");
		emplo.name = sc.nextLine();
		
		System.out.println("Gross salary: ");
		emplo.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		emplo.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s , $ %.2f %n",emplo.name, emplo.netSalary());
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emplo.increaseSalary(percentage);
		
		System.out.printf("Update data: %s, $ %.2f", emplo.name, emplo.netSalary());
		
		sc.close();

	}

}
