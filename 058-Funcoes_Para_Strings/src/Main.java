
public class Main {

	public static void main(String[] args) {
		
		// TRANSFORMANDO STRINGS
		
		String original = "- abcde FGHIJH ABC abc DEFG    ";
		
		String minuscula = original.toLowerCase(); // Transformando em minusculas
		String maiusculas = original.toUpperCase(); // Transformando em maiusculas
		String espacoslaterais = original.trim(); // Elimina espaços no final da frase
		String selecionaString = original.substring(2); // Seleciona o texto da posição indicada em diante
		String recortaTexto = original.substring(2, 9); // Recorta o texto da posição inicial a posição anterior ao numero final
		String trocaLetra = original.replace("a", "x"); // Fará a troca de todas "a" minusculo pelo "x" minusculo
		String trocaString = original.replace("abc", "xy"); // Fará a troca da String toda abc por xy
		int i = original.indexOf("bc"); // Aqui encontro a primeira posição das letras ou ocorrencia indicada
		int j = original.lastIndexOf("bc"); // Aqui encontro a última posição das letras ou ocorrencia indicada
		
		
		/* Usando split, posso separar um texto em palavras separadas dentro de um vetor, 
		 * passando o local em quero que seja feita essa separação, nesse caso passei o espaço em branco como esse parametro
		 */
		String s = "potato apple lemon";	
		String[] vect = s.split(" "); // O espaço em branco é o local em que indiquei para ser feita a separação das palavras
				
		System.out.println(original + " - Original");
		System.out.println(minuscula + " - Transformando em minusculas");
		System.out.println(maiusculas + " - Transformando em maiusculas");
		System.out.println(espacoslaterais + " - Elimina espaços no final da frase");
		System.out.println(selecionaString + " - Seleciona o texto da posição indicada em diante");
		System.out.println(recortaTexto + " - Recorta o texto da posição inicial a posição anterior ao numero final");
		System.out.println(trocaLetra + " - Fará a troca de todas (a) minusculo pelo (x) minusculo");
		System.out.println(trocaString + " - Fará a troca da String toda abc por xy");
		System.out.println(i + " - Aqui encontro a primeira posição das letras ou ocorrencia indicada");
		System.out.println(j + " - Aqui encontro a última posição das letras ou ocorrencia indicada");
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}
