package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		/* SOBRECARGA
		 * 	É um recurso que uma classe possui de oferecer mais de uma operação
		 * com o mesmo nome, porém com diferentes listas de parâmetros.
		 */
		
		/* PROPOSTA DE MELHORIA
		 * 	Vamos criar um construtor opicional, o qual recebe apenas nome e preço
		 * do produto. A quantidade em estoque deste novo produto, por padrão,
		 * deverá então ser iniciada com o valor zero.
		 * 
		 * Nota: é possível também incluir um construtor padrão.
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Nota: é possível também incluir um construtor padrão.
		//Product p = new Product(); // Assim posso instanciar meu contrutor padrão sem erros.
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		/*System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt(); Posso retirar essa variavél de entrada*/
		
		Product product = new Product(name, price);/* Aqui eu obrigo o programador 
		a imformar os dados dos produtos no memento da instânciação. */
		
		//---------------------------------------------------------------------------------
		// ENCAPSULAMENTO
		product.setName("Computer"); /*Essa é a forma para acessar meu objeto, que agora
		está no modo "private", criando um método set e acessando o mesmo atravéz do método,
		OBS.: Aqui faço alteração do valor ou nome do objeto*/	
		
		System.out.println("Update name: " + product.getName());/*Após ser criado o método
		"get" consigo imprimir meu atributo name na tela, Obs.: Aqui acesso o objeto*/
		
		// Aqui altero o valor do objeto
		product.setPrice(1200.00);
		
		//Aqui acesso o objeto
		System.out.println("Update price: " + product.getPrice());
		
		
		//----------------------------------------------------------------------------------
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
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

