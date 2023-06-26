package entities;

public class Calculos {
	
	private double numeros;
	private double soma;
	
	public Calculos(double numeros, double soma) {//, double soma
		this.numeros = numeros;
		this.soma = 0;//Dessa forma, não sou abrigado a passar valores para o construtor ao instanciar
	}
	
	public double getNumeros() {
		return numeros;
	}

	public double getSoma() {
		return soma;
	}

	public void setSoma(double somar) {
		this.soma += somar;
	}
	
	/*public float media(double soma, float n) {
		float resultado;
		resultado =  n;
		return resultado;
	}*/

	
}
