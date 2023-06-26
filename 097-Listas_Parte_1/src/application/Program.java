package application;

public class Program {

	public static void main(String[] args) {
		/*		Lista é uma estrutura de dados:
		 * Homogênea (Dados do mesmo tipo)
		 * Ordenada (Elementos acessados por meio de posições)
		 * Inicia vazia, e seus elementos são alocados sob demanda
		 * Cada elemento ocupa um "nó" (ou nodo) da lista
		 */
		
		/*		Tipo (interface):List
		 * Eu não posso instânciar um tipo List porque ela é uma interface, para instânciar 
		 * um tipo List, eu vou precisar de uma classe que implemente essa interface.
		 * Temos varias classes que implementam a interface List, por exemplo:
		 * Classes que implementam: Arraylist, Linkedlist, etc. 
		 */
		
		/*		Vantagens:
		 * Tamanho variável
		 * Facilidade para se realizar inserções e deleções.
		 */
		
		/*		Desvantagens:
		 * Acesso sequêncial aos elementos: Obs(Para percorrer a lista eu preciso percorrer
		 * elemento por elemento, mas ela também pode ser otimizada para ter o comportamento
		 * semelhante ao de um vetor), e isso minimiza essa desvantagem de acesso sequêncial
		 * aos elementos.
		 */
		
		/*			Demo
	  	 * • Tamanho da lista: size()
		 * • Obter o elemento de uma posição: get(position)
		 * • Inserir elemento na lista: add(obj), add(int, obj)
		 * • Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
		 * • Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
		 * • Filtrar lista com base em predicado:
		 *    List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
		 * • Encontrar primeira ocorrência com base em predicado:
		 *    Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
		 */
 
		/* 		Assuntos pendentes:
		 * • interfaces
		 * • generics
		 * • predicados (lambda)
		 */
		
		
	}

}
