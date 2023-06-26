package application;

public class Program {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x; /* Aqui criei uma variavél do tipo Object, como uma classe,
		sem tratar o tipo primitivo */
		
		System.out.println(obj);
		
		int y = (int)obj;// Dessa forma preciso fazer o "casting", para tratar o tipo primitivo.
		
		System.out.println(y);
//--------------------------------------------------------------------------------------------		
		System.out.println();// Pular linha
//---------------------------------------------------------------------------------------------		
		/*O JAVA TEM TIPOS CLASSES COMPATIVEL AOS TIPOS PRIMITIVOS*/
		int a = 20;		
		Integer objt = a; /*Dessa forma eu já trato os tipos primitivos como classes,
		de uma forma transparente ao compilador*/
		
		
		System.out.println(objt);
		
		int b = objt * 2;//Sendo assim não preciso fazer o casting para conversão.
		
		System.out.println(b);
	}

}
