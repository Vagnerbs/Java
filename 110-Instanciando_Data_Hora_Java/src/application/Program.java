package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// Instanciação data e hora
		//Aqui pegamos a data do sistema e instanciamos em um objeto, nesse caso LocalDate d01
		
		LocalDate d01 = LocalDate.now();//Data local do meu sistema	
		LocalDateTime d02 = LocalDateTime.now();//Data e hora local com fração de segundos
		Instant d03 = Instant.now();//Data, hora e fração de segundos-Global padrão GMT - Horário de Londres
		
		LocalDate d04 = LocalDate.parse("2023-02-22");//Imprime a data que eu passo para o objeto
		LocalDateTime d05 = LocalDateTime.parse("2023-02-22T01:30:26");//Imprime a data e hora que eu passo para o objeto
		Instant d06 = Instant.parse("2023-02-22T01:30:26Z");//Imprime a data e hora que eu passo para o objeto com o padrão GMT - Horario de Londres
		Instant d07 = Instant.parse("2023-02-22T01:30:26-03:00");//Aqui estou dizendo para o sistema que estou com 3 horas a menos no fuzo horario, então ele me adianta 3 horas de acordo com o horario que passei
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("22/02/2023", fmt1);//Temos outras formas de formatar uma data na documentação
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("22/02/2023 01:30", fmt2);//Temos outras formas de formatar uma data na documentação
		
		LocalDate d10 = LocalDate.of(2023, 2, 22);
		LocalDateTime d11 = LocalDateTime.of(2023, 2, 22, 1, 30);
		
		System.out.println("d01 = " + d01.toString());//Posso mostrar a resposta sem o toString, pois o objeto já assume o modelo de resposta por padrão ao ser instânciado.
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);	
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);

	}

}

/*Principais tipos Java (versão 8+) 
 * 
 * • Data-hora local
 *		LocalDate
 *		LocalDateTime
 *
 * • Data-hora global
 *		Instant 
 *
 * • Duração
 *		Duration
 *
 * • Outros
 *		ZoneId
 *		ChronoUnit
 */

