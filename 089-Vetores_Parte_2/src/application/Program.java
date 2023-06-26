package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];//Criei para acessar os valores
		Product[] nome = new Product[n];//Criei para acessar os nomes
		
		for (int i=0; i < vect.length; i++) {//lenght percorre o tamanho do vetor.
			
			sc.nextLine();//Consome a quebra de linha que ficou pendente do nextInt acima.
			
			String name = sc.nextLine();//Recebe o nome
			
			double price = sc.nextDouble(); // Recebe o preço
			
			nome[i] = new Product(name, price);//Criei para acessar os nomes
			vect[i] = new Product(name, price);/*Nesse caso preciso instanciar o meu vetor
			com o meu produto por se tratar de outra classe, dessa forma as posições do meu vetor
			irão apontar para os produtos, pois nesse caso eles por padrão ficam como nulos,
			ao instanciar apontamos para o valor que desejamos trabalhar em cada posição */
		}
		
		double sum = 0;
		
		for (int i=0; i < vect.length; i++) {
			sum += vect[i].getPrice();//Dessa forma acesso os valores para poder fazer a soma.
			
		}
		
		double avg = sum /vect.length;
		
		/*Se eu não pegar os nomes igual os valores acima, preciso fazer dessa forma 
		para ter acesso aos nomes*/
		System.out.printf("Average Price =  %s, %s, %s - $ %.2f", nome[0].getName(),
				nome[1].getName(), nome[2].getName(), avg);//Preço médio
		sc.close();
	}

}
