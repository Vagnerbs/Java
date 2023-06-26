package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Aqui chamei minha classe Product e declarei uma variavel com o nome product,
		depois instânciei com a mesma classe Product. Obs.: Quando eu faço isso eu 
		importo minha classe Product, e instâncio ela com a mesma classe Product, que
		está no meu pacote entities, para que eu possa acessar a mesma, e trabalhar com
		os dados dela.*/
		Product product = new Product(); //ctrl + shift + O = Importa a calsse Product
		
		System.out.println("Enter Product data: ");
		
		System.out.print("Name: ");
		product.name = sc.nextLine(); /*Aqui recebo o nome e armazeno dentro da minha 
		String "name" que está em Product, pois está instânciado com a classe principal,
		sendo assim consigo inserir os dados no meu objeto.*/
		
		System.out.print("Price: ");
		product.price = sc.nextDouble(); //Mesmo caso da varíavel acima.
		
		System.out.print("Quantity in Stock: ");
		product.quantity = sc.nextInt(); //Mesmo caso da varíavel acima.
				
		System.out.println();//Pular uma linha
		System.out.println("Product data: " + product);
		/*Aqui chamo apenas minha classe(product e não Product pois estão intânciadas)
		 *para exibir a resposta, pois todos os paramêtros e formatação para 
		 *resposta já estão feitos lá na classe Product */ 
		
		System.out.println();//Pular uma linha	
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt(); //recebe o numero de produtos		
		product.addProducts(quantity); //Pega o número de produtos de (int quantity)e passa para o addProducts
		
		System.out.println();//Pular uma linha
		System.out.println("Updated data: " + product); 
		
		System.out.println();//Pular uma linha	
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProduts(quantity);
		
		System.out.println();//Pular uma linha
		System.out.println("Updated data: " + product); 
		/*Aqui chamo apenas minha classe(product e não Product pois estão intânciadas)
		 *para exibir a resposta, pois todos os paramêtros e formatação para 
		 *resposta já estão feitos lá na classe Product */
			
		sc.close();
	}

}

/* Toda classe em java é um subclasse da classe Object
 * 
 * Object possui os seguintes métodos:
 * getClass - Retorna um tipo de objeto
 * equals - Compara se objeto é igual a outro
 * hashCode - Retorna um código hash do objeto
 * toString - Converte em objeto para String - Utilizado nesta aula
 */
