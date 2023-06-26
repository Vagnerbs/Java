package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
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
	
	//--------------------------------------------------------------------------------
	// ENCAPSULAMENTO
	
	/*Obs.: Por convenção esses métodos são colocados depois dos construtores,
	 * Esse método permite que o valor possa ser alterado
	 * Aqui estou criando o método "set" para poder acessar meu objeto que agora está 
	 * no modo private.
	 */
	public void setName(String name) { // Esse método permite que o valor possa ser alterado
		this.name = name;
	}
	
	
	/*Esse método "get" possibilita o acesso ao meu atributo "name", sem ele não consigo acessar
	 * o mesmo para imprimir direto na tela
	 */
	public String getName() { //Esse método pemite que o objeto sejá acessado
		return name;
	}
	
	public void setPrice(double price) { //Esse método permite que o objeto sejá alterado
		this.price = price;
	}
	
	public double getPrice() { //Esse método pemite que o objeto sejá acessado
		return price;
	}
	
	/*Nesse caso foi criado somente o "get", para evitar que sejam feitas alterações
	 * inconsistentes no meu programa, pois a quantia só pode ser alterado quando
	 * ouver entrada e saída de produtos e não diretamente. */
	public int getQuantity() { //Esse método pemite que o objeto sejá acessado
		return quantity;
	}

	
	//--------------------------------------------------------------------------------
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
