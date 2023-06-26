
public class Main {

	public static void main(String[] args) {
		
		/* Declarando as variáveis dessa forma, o resultado será (2),
		 *  porque o programa entende que se trata de dois números inteiros,
		 *  então ele divide um inteiro por outro, excluindo o resto da divisão,
		 *  para sair o resultado correto precisamos fazer igual o programa abaixo.
		 */
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = a / b;
		
		/*
		 * Dessa forma ele faz o casting (conversão explicita de valores),
		 * usando o (double na frente da expressão a ser executada),
		 * sendo assim o resultado sairá como double, e ficará (2,5).
		 */
		
		System.out.println(resultado);
		
		int c, d;
		double resultado2;
		
		c = 5;
		d = 2;
		
		resultado2 = (double) c / d; //Aqui será incluido o double, ou o casting como é chamada essa conversão de dados.
		
		System.out.println(resultado2);
		
		/*
		 *Aqui irei fazer a conversão de double(ponto flutuante) para int(inteiro),
		 *sem me importar com a perda de informações, ou sejá o que está depois do ponto flutuante,
		 *nesse caso se eu trabalhar sem o int, o programa apresentará erro, por se tratar de um valor,
		 *"com" casas decimais passando para um valor "sem" casas decimais, quando eu coloco o (int), 
		 *eu falo para o programa que concordo com essa perca de informação e ele prossegue com a operação.
		 */
		
		
		double e;
		int f;
		
		e = 5.0;
		f = (int)e; //Aqui será incluido o int, ou o casting como é chamada essa conversão de dados.
		
		System.out.println(f);
		
		

	}

}
