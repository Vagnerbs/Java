package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2023-02-22");//Imprime a data que eu passo para o objeto
		LocalDateTime d05 = LocalDateTime.parse("2023-02-22T01:30:26");//Imprime a data e hora que eu passo para o objeto
		Instant d06 = Instant.parse("2023-02-22T01:30:26Z");//Imprime a data e hora que eu passo para o objeto com o padrão GMT - Horario de Londres
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");//Determinando o formato que desejo imprimir
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");//Determinando o formato que desejo imprimir
		
		//O método GMT Instant não aceita format, por isso temos que fazer dessa forma, considerando o fuzo horário do sistema local.
		//Ao chamar o metódo para imprimir a resposta, preciso fazer atravéz do meu objeto fmt3.
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());//Determinando o formato que desejo imprimir
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;//Não podemos imprimir uma data global GMT dessa forma, porque o padrão ISO, usa a data local como padrão.
		
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;//Dessa forma podemos imprimir uma data no padrão GMT - Global
		
		System.out.println("d04 = " + d04.format(fmt1));//Dessa forma eu imprimo no formato desejado, passando o formato determinado como paramêtro.
		System.out.println("d04 = " + fmt1.format(d04));//Dessa forma eu imprimo no formato desejado, passando o formato determinado como paramêtro.
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));//Dessa forma eu imprimo no formato desejado, passando o formato determinado como paramêtro.
		
		System.out.println("-------------------------------------");
		
		System.out.println("d05 = " + d05.format(fmt1));//Dessa forma eu imprimo no formato desejado, passando o formato determinado como paramêtro.
		System.out.println("d05 = " + d05.format(fmt2));//Dessa forma eu imprimo no formato desejado, passando o formato determinado como paramêtro.
		
		System.out.println("-------------------------------------");
		
		System.out.println("d05 = " + d05.format(fmt4));//Dessa forma eu imprimo no formato desejado, passando o formato determinado como paramêtro.
				
		System.out.println("-------------------------------------");
		
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));
	}

}
