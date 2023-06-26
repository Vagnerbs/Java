package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account; /* Variavel declarada para receber a instânciação que foi feita no meu 
		if, se não fizer assim ficará limitada a usar apenas la dentro*/
		
		System.out.println("Enter account number: ");//Digite o número da conta.
		int number = sc.nextInt();
		
		System.out.println("Enter account holder: ");//Digite o titular da conta.
		sc.nextLine();//Como tem un nextInt acima, preciso consumir a quebra de linha pendente
		String holder = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)? ");//Existe um depósito inicial (s/n)?
		char response = sc.next().charAt(0);// Aqui leio o caractere da resposta.
		
		if(response == 'y') {
			System.out.println("Enter initial deposit value ");//Digite o valor do depósito inicial.
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);/*Aqui instânciei minha variável
		 	com meu construtor de 3 parâmetros, preciso da variavél declarada fora do if, senão 
		 	meu construtor poderá ser acessado apenas aqui dentro.*/
			
		}
		//Aqui temos uma sobrecarga na prática
		else {
			account = new Account(number, holder);/*Aqui foi feita a instânciação com meu construtor
			que contem 2 parâmetros, porque aqui é caso não tenha um depósito inicial.*/
		}
		
		// Aqui mostra os primeiros dados inseridos da conta
		System.out.println();
		System.out.println("Account data:");// Dados da conta	
		System.out.println(account);
		
		//Aqui será inseridos os dados do depósito
		System.out.println();
		System.out.println("Enter a deposit value: ");//Insira um valor de depósito
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);//Esse parâmetro está sendo passado para minha Classe deposit.
		
		//Aqui será mostrado o valor atualizado da conta com deposito
		System.out.println("Update account data:");//Atualizados dados da conta
		System.out.println(account);
		
		//Aqui será inserido o valor do saque
		System.out.println();
		System.out.println("Enter a withdraw value: ");//Insira um valor de saque
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);//Esse parâmetro está sendo passado para minha Classe deposit.
		
		// Aqui será mostrado o valor da conta atualizado com o saque
		System.out.println("Update account data:");//Atualizados dados da conta
		System.out.println(account);
			
		//System.out.println(account.getNumber());//Mostra a resposta diretamente atravéz so método get
		sc.close();

	}

}


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
