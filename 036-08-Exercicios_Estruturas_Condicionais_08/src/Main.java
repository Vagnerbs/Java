import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, 
		 *pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população,
		 *sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		 *Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. 
		 *Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		 */
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double sal, imp;
			
			sal = sc.nextDouble();
			
			if(sal <= 2000.00) {
				imp = 0.0;
			}
			
			else if(sal <= 3000.00) {
				imp = (sal - 2000.00) * 0.8;
				
			}
			
			else if(sal <= 4500.00) {
				imp = (sal - 3000.00) * 0.18 + 1000.00 * 0.08;
			}
			
			else {
				imp = (sal - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
				
			}
			
			if (imp == 0.0) {
				System.out.println("Isento");
			}
			
			else {
				System.out.printf("R$ %.2f%n", imp);
			}
		
			sc.close();

		}
	}
