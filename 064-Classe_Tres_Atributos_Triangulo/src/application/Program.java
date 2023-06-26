package application;

import java.util.Locale;

import java.util.Scanner;

import entities.Triangle;

public class Program {
		
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Triangle x, y; /*(Obs.: Ctrl + Shift + O = importa a classe do pacote entities)
		* O Triangle substitui o tipo de variável, nesse caso substituiu o double,
		* a variavel X e Y assumem o tipo double que foi declarada na classe Triangle,
		* (Obs.: X e Y se tornam objetos, no caso objetos da classe Triange) */
		x = new Triangle(); // Para o objeto existir eu preciso instânciar esse objeto
		y = new Triangle(); /* Posso acresentar mais variaveis se neceesario, 
		é só acrecentar na classe trianglo, e instânciar na minha class Program nesse caso */
				
		System.out.println("Enter the measures of triângle X: "); // Digite as medidas do triângulo x
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triângle Y: "); // Digite as medidas do triângulo x
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
				
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c ) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Triângle X area: %.4f%n", areaX);
		System.out.printf("Triângle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
				
		sc.close();		
	}
}
//PROBLEMA DO EXERCÍCIO ANTERIOR RESOLVIDO COM CLASSES

/* Fazer um programa para ler as medidas dos lados de um triângulo x e y,
 * (suponha medidas válidas). Em seguida mostrar o valor das áreas dos dois triângulos
 * e dizer qual dos dois triângulos e dizer qual dos dois triângulos possui maior área.
 */

/* Triângulo é uma entidade com três atributos:a, b, c.
 * 
 * Estamos usando três varíaveis distintas para representar cada triângulo:
 * double ax, bx, cx, ay, by,cy;
 * 
 * Para melhorar isso, vamos usar uma CLASSE para representar um triângulo.
 * 
 * - CLASSE -
 * É um tipo de estrutura que pode conter (membros):
 * - Atributos(dados/campos)
 * - Métodos(funções/operações)
 * - Classe - é a definição do tipo ( Minha classe Triangle, tem os atributos a, b, c)
 * - Objetos - São instâncias da classe ex: x = new Triangle(); y = new Triangle();
 *   ( X = Objeto que vai ser um triângulo e Y = Objeto que vai ser outro triângulo)  
 * 
 * A classe também pode prover muitos outros recursos, tais como:
 * - Construtores
 * - Sobrecarga
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 *  
 * EXEMPLOS:
 * - Entidades: Produto, Cliente, Triângulo
 * - Serviços: ProdutoService, ClienteService, ClienteController
 * - Controladores: ProdutoController, ClienteController
 * - Utilitários: Calculadora, Compactador
 * - Outros: (views, repositórios, gerenciadores, etc.)
 */

/* INTANCIAÇÃO
 * 
 * Quando crio minhas variáveis "double areaX, areaY, p; Triangle x,y;" essas variáveis 
 * são criadas em local da memória chamado "Stack"( aonde ficam as variáveis do tipo estáticas ),
 * durante a execução do programa faço a "alocação dinâmica de memória", com o comando
 * "NEW"( ou seja instâncio a varíavel a uma outra classe recebendo os dados dela), 
 * sendo assim, é criada uma outra área de memória chamada "HEAP"
 * ( Uma área de memória aonde sáo criados os elementos dinâmicos ), dessa forma
 * a variável "X" e "Y" ( Que está na memória "STACK" ) ficará alocado somente um endereço de memória,
 * apontando para o "OBJETO" que foi criado no "HEAP"( Aonde ficam os elementos dinâmicos ).
 * */

