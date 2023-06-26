package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	/*
	 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e
	 * salario) de N funcionários. Não deve haver repetição de id. 
	 * 
	 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
	 * Para isso, o programa deve ler um id e o valor X. Se o id informado não
	 * existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a
	 * listagem atualizada dos funcionários, conforme exemplos.
	 * 
	 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado
	 * livremente. Um salário só pode ser aumentado com base em uma operação de
	 * aumento por porcentagem dada.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Obs: O tipo List é uma "interface" e não uma "classe", interface não pode ser instânciada,
		 *será intânciada uma classe concreta que implementa a interface, nesse caso usaremos o
		 *ArrayList. 
		 *Obs: Employee, foi uma especificação do tipo da minha lista, nesse caso foi
		 *Employee(funcionário), isso é um tipo genérico.*/
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered?");
		int N = sc.nextInt();
		
		for(int i=0; i < N; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i+1) + ":");
			
			System.out.print("Id: ");
			Integer Id = sc.nextInt();
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			/*Instânciei o objeto e passei as informações como paramêtro para minha classe Employee,
			 * criando uma nova variavél com esses mesmos dados*/
			Employee emp = new Employee(Id, name, salary); 
			
			/*Aqui peguei os dados da variavél que foi criada acima e intânciada, 
			 *e adicionei a minha lista.*/
			list.add(emp); //list é o nome da lista.
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		
		/*FUNÇAO LAMBIDA = OTIMIZO O CÓDIGO
		 * 
		 * 1° (list.stream()= Transformei minha lista em uma stream, tipo especial do java,
		 * que aceita funções de alta ordem, funções lambida.
		 * 
		 * 2° filter(x -> x.getId() == idSalary) = Ela filtra minha lista atendendo o predicado
		 * que foi determinado dentro dele, nesta caso "eu quero somente os funcionarios x,
		 * tal que o x.getId(acessa o id da minha lista que está intanciado com meu Employee), 
		 * for igual ao meu idSalary, que o usuario passou como identifição para o aumento.
		 * 
		 * 3° findFirst() = Pega o primeiro da lista que for igual ao digitado pelo usúario
		 * 
		 * 4° orElse(null) = Se não existir retorne nulo.
		 */
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		//Aqui estou procurando a posição do idSalary dentro da lista
		//Integer pos = position(list, idSalary);
		
		//Se não tiver funcionario com o id procurado
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		
		// Se tiver o funcionario com o id procurado
		else {
			System.out.print("Enter the percentage: ");//Entre com a porcentagem
			double percentage = sc.nextDouble();
			
			//Passando a porcentagem como parametro para minha função
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of Empoyees: ");
		
		/*Aqui pego meu Employee que está instânciado(no caso acesso a minha lista),
		 *criei uma variavel emp, e acessei todos dados da minha lista,
		 *e para cada dado ele faz uma impressão.*/
		for (Employee e: list) {
			System.out.println(e);
		}
		
		sc.close();
	}
	
	//COM A FUNÇÃO LANBIDA NÃO PRECISO DESSA PARTE DO PROGRAMA
	
	/*Método(porque tem retorno, se não seria função) auxiliar para procurar um elemento na lista
	 * 
	 *Obs:Mesmo usando o mesmo nome list nessa função, se trata de outra varivél, por ser
	 *outro escopo, pois foi iniciado depois da chave do meu sc.close. 
	 */
	
	/*public static Integer position(List<Employee> list, int id) {
		list.(size), percorre o tamanho da lista.
		list.(get), posição na lista.
		
		for(int i=0; i < list.size(); i++) {
		
			
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}*/
	
	/*if: se elemento da lista na posição i, (.), pego o id na posição i, se o id na posição i,
	 *for igual ao id que forneci como argumento, retorne o valor de i.
	 */
}
