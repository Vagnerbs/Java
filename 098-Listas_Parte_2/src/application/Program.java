package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		/*Lista, diferente do vetor não aceita tipos primitivos ex:(int), precisamos usar 
		 *a wapper class do tipo primitivo, nesse caso para inteiros "Integer"*/
		
		/*Usaremos a Classe ArrayList para implementar a interface List, porque ela é muito
		 *otimizada e pega as melhores caracteristicas tanto do vetor quanto da lista
		 */
		
		//No exemplo abaixo trabalharemos com Strings
		
		List<String> list = new ArrayList<>();
		List<Integer> numero = new ArrayList<>();
		
		list.add("Maria");//Adicionar elementos
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2,"Marco");//Adicionar o elemento na posição desejada.
		numero.add(5);
		numero.add(8);
		System.out.println(list.size());//Imprime o tamanho da lista.
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------------------");
		
		//list.remove(1);//Remove um dado inserido na lista, por posição.
		//list.remove("Ana");//Remove um dado inserido na lista.
		
		//Siginicado: remova de todo String x, talque, x,se caractere na posição zero, for igual á 'M'
		list.removeIf(x -> x.charAt(0) == 'M');/*Aqui estou removento um elemento por "predicado", aqui
		*estou definindo uma função lambida, que será explicada mais a frente no curso, ele se chama
		*predicado porque é uma função que retornará verdadeiro ou falso, irá remover todo os nomes
		*iniciados pelo caractere M. 
		*/
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------------------");
		System.out.println("Posiçaõ do numero: " + numero.indexOf(8));//Indica a posição na lista
		System.out.println("Posiçaõ na lista: " + list.indexOf("Bob"));//Indica a posição na lista
		System.out.println("Posiçaõ na lista: " + list.indexOf("Marco"));/*Indica a posição na lista,
		quando não encontra o elemento ele retornaa -1.*/
		
		System.out.println("----------------------------------------");
		
		/*Aqui deixo apenas os nomes iniciados com a letra A*/
		/*1° converto para String, 2° Faço a operação lambida que quero, 3° Volto ele para lista*/
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------------------");
		
		
		/* Como retornar apenas o 1° elemento com a letra A.
		 * 1° crio uma nova String e recebo minha lista convertida para String, 
		 * 2° Faço a operação lambida que quero, 
		 * 3° O meu findFirst, pega o meu primeiro elemento do predicado, no caso o A, e se esse
		 * elemento não existir ele me retona nulo
		 */
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
