package entities;

public class Triangle {
	
	//Atributos da minha classe
	public double a;
	public double b;
	public double c;
	//public double d;	posso usar mais variáveis se necessário
	
	/* Não foi passado parâmetro para essa função, pois a classe acima já
 	recebeu os parâmetros que iremos utilizar */
	public double area() {
		double p = (a + b + c) / 2.0;
		double result = Math.sqrt(p * ( p - a) * (p - b) * (p - c));
		return result;
	}
}

