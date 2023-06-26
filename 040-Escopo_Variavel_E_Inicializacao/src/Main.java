
public class Main {

	public static void main(String[] args) {
		
		// Uma variável só pode ser usada se ela for iniciada com algum valor em Java.
		
		// Uma variável também só pode ser usada se estiver dentro do mesmo escopo em que foi declarada.
		
		double price = 400;
		
		double discont; // discont = 0; Exemplo para corrigir o erro.
		
			if (price < 200) {
				discont = price * 0.1;
			}
		
			/*else {
				discont = 0; // Aqui também se corrige esse erro.
			}
			*/
		System.out.println(discont);
		/*Neste caso mesmo ela estando dentro do mesmo escopo, o compilador entende 
		*que a variável, pode não ter um valor caso o price sejá maior que 200, ou seja ela não foi iniciada, 
		*por isso da erro, por isso devemos ou inicializar com um valor ou colocar outra condicao 
		*caso o valor seja maior que 200, exemplo um else.
		*/
	}

}
