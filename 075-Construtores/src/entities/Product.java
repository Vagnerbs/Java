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