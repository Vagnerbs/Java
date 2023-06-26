package application;

public class Program {

	public static void main(String[] args) {
		/*Sintaxe opcional e simplificada para percorrer coleções*/
		
		/*Sintaxe:
		 *	for(Tipo-Apelido : coleção) {
		 *	<comando 1>
		 *	<comando 2> 
		 *	}
		 */
		
		String[] vect = new String[] {"Maria" , "Bob" , "Alex"};
		
		for(int i=0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("------------------------------------------------------");
		
		//AGORA USANDO O FOR EACH
		
		for (String nomes : vect) {
			System.out.println(nomes);
		}

	}

}
