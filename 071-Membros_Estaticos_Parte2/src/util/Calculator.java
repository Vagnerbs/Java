package util;

public class Calculator {
	/*final double PI = 3.14159; A constante poderia ser declarada dessa forma, porém estamos 
	aprendendo membros estáticos por isso faremos de outra forma.*/ 
	public static final double PI = 3.14159;// Para constantes usamos sempre letras maiúsculas "PI"
	
	// Dessa forma não é preciso fazer a intanciação na classe principal
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume (double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
