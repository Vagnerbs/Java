package entities;

public class Account {
	/*Criei meus atributos do tipo private para ter mais segurança no projeto,
	 *por isso preciso irei precisar dos métodos get e set para acessalos*/
	private int number;
	private String holder;
	private double balance;
	
	//------------------CONSTRUTORES--------------------------------------------
	
	//Aqui criei meu 1° construtor recebendo 2 argumentos
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	//Aqui criei meu 2° construtor recebendo 3 argumentos
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);/*Nesse caso foi feito dessa forma porque para esse
		problema proposto, não estou passando o valor do saldo, mais sim o valor do 
		"depósito inicial", por isso chamei minha operação deposito ou minha Classe depósito
		e passei o paramêtro (initialDeposit) como argumento e retirei o meu argumento "balance"
		do meu construtor, porque futuramente se houver alguma alteração nas regras de depósito
		meu Construtor estará protegido, e farei a alteração apenas na minha classe depósito, 
		isso também é tido como encapsulamento, pois minha classe deposit está encapsulando
		um argumento dentro do meu construtor.*/
		  	
	}
	
	//-----------------MÉTODOS GET E SET-------------------------------------------
	/*
	public int getNumber() {
		return number;
		//Aqui ficara somente o get number porque o número da conta não pode ser alterado.	
	}
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
		/*Aqui foi apagado o setbalance, pois o valor da conta só poderá ser alterado por
		  meio de saque e depósito 
	}*/
	
	//------------------Criação das Classes-----------------------------------
	
	//Classe para receber o valor do depósito.
	public void deposit(double depositValue) {
		balance += depositValue;
	}
	//Classe para efetuar o saque mais a taxa de 5 dolares.
	public void withdraw(double withdrawValue) {
		balance -= withdrawValue + 5;
	}
	
	
	//------------------Método personalizado para apresentar a resposta-------------------
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}
