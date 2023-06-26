package entities;

public class Product { // Minha classe Product é um object
	public String name;
	public double price;
	public int quantity;
		
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		/* O this, torna explicito que estou trabalhando com o atributo da classe
		 *(public double "quantity"; Obs.: Isso é uma classe), e não com o parâmetro que foi passado
		 *pelo método (public void addProducts(int "quantity")).
		 *this = Significa uma auto referência para o objeto.
		 */
		
		/* Se não fizer isso vai dar errado o calcúlo, pois será somado o quantity do
		 * método mais o quantity do mesmo método. */
		this.quantity += quantity; 
	}
	
	public void removeProduts(int quantity) {
		this.quantity -= quantity;
	}
	
	/*Aqui irei sobrepor a minha classe toString que já vem no object da minha classe Product,
	 entaõ aqui dentro dessa nova classe irei poder implementar minha versão toString, ao invés
	 de utilizar a versão padrão.*/
	/* Dessa forma posso fazer toda minha formatação que será impressa na resposta*/
	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueInStock());		
	}
}
