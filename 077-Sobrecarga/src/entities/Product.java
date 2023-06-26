package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	// Aqui irei incluir meu "CONSTRUTOR", que geralmente fica depois dos atributos e antes dos métodos
	/* Por conversão ou boa prática colocarei os mesmos nomes dos atributos como paramêtro, 
	 *(poderia ser outros nomes), assim ele obriga a fornecer esses dados no momento da instanciação*/ 
	/*Ele é parecido com método comum, porém sem o tipo de retorno, e ele será executado no momento da
	instanciação do objeto*/
	public Product(String name, double price, int quantity) {
		// this, referencia o atributo do objeto.
		// somente "name", ele está referenciando o paramêtro do construtor.
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/* Novo construtor, posso trabalhar com construtores tendo o mesmo nome,
	mas recebendo paramêtros diferentes*/
	public Product(String name, double price) {
		// this, referencia o atributo do objeto.
		// somente "name", ele está referenciando o paramêtro do construtor.
		this.name = name;
		this.price = price;
		/*quantity = 0;Como não quantity como parametro no meu construtor não preciso do this,
		porém essa atribuição é opcional, pois meu atributo já começa com zero por padrão.*/
	}
	
	public Product() {//Também posso declarar um contrutor padrão, sem paramêtros.	
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}