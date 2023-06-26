package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);/* Aqui eu obrigo o usuario 
		a imformar os dados dos produtos no memento da instânciação. */
				
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}

/* Construtor
 * 	É uma operação especial da classe, que executa no momento da instanciação do objeto
 * 
 * Usos comuns:
 * 	Iniciar valores dos atributos
 *  Permitir oou obrigar que o objeto receba dados/ dependências no momento de sua instanciação
 *  (injeção de dependência).
 *  
 * Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
 *  Product p = new Product();
 *  
 * É possível especificar mais de um construtor na mesma classe (sobrecarga). 
 *   
 */
 