import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 4 - Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
		 *sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		
		Scanner sc = new Scanner(System.in);
			
		int hi = sc.nextInt();
		int hf = sc.nextInt();
			
		int duracao;
		
		if(hi < 0 || hf > 24) {
			System.out.println("HORA INVÁLIDA");
		}
		
		else {			
			if(hi > hf){
				duracao = (24 - hi) + hf;
			}
				
			else {
				duracao = hf - hi;
			}
		
		System.out.printf("O JOGO DUROU %d HORAS(S)", duracao);
				
		}
		sc.close();
	}	
}


