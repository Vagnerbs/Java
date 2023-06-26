package entities;
/* Em um banco para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
 *titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor
 *de depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no 
 *momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será,
 *naturalmente, zero.
 *
 *  Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado.
 * Já o nome do titular pode ser alterado(pois uma pessoa pode mudar o nome por ocasião de casamento
 * por exemplo).
 * 
 *  Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para 
 * proteger isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada
 * saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se 
 * o saldo não for suficiente para realizar o saque e/ou pagar a taxa.
 * 
 *  Você deve fazer um programa que realize o cadastro de uma conta, dando a opção para que seja ou
 * não informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, 
 * sempre mostrando os dados da conta após cada operação.
 */
public class Conta {
	//Atributos
	private int numConta;
	private String nome;
	private double saldo;
	
//------------------------------------------------------------------	
	
	//Construtor sem depósito Inicial
	public Conta(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}
	
	//Construtor com depósito Inicial
	public Conta(int numConta, String nome, double depInicial) {
		this.numConta = numConta;
		this.nome = nome;
		//this.saldo = depInicial;
		setSaldo(depInicial);/*Foi feito um encapsulamento e passado para o valor do meu saldo
		inicial direto para o método setSaldo, ou receber esse valor ele já passa automaticamente
		para o meu saldo, fiz isso para proteger meu construtor de alterações no caso de alguma
		mudança nas taxas por exemplo do meu depósito.*/
	}
	
//------------------------------------------------------------------
/*	// Não preciso do método get/set para funcionar esse programa
	//Acesso ao número da conta
	public int getNumConta() {
		return numConta;
	}
	
	//Acesso ao nome
	public String getNome() {
		return nome;
	}
	
	//Alteração do nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Acesso ao depósito inicial
	public double getSaldo() {
		return saldo;
	}
	*/
	//Aqui fiz alteração do valor do depósito pelo método set e do saque fiz através de uma classe.
	public void setSaldo(double valorDeposito) {
		this.saldo += valorDeposito;
	}

//---------------------------------------------------------
	//Classe para efetuar depósito
	/*public void deposito(double valor) {
		this.saldo += valor;
	}*/
	
	//Classe para efetuar saque
	public void saque(double valorSaque) {
		this.saldo -= valorSaque + 5;
	}
	
//--------------------------------------------------------
	public String toString() {
		return "Conta "
				+ numConta
				+ ", Nome: "
				+ nome
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
	}
	
}

