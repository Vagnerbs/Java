package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
	
	public static void main(String[]args) {
		
		LocalDate d04 = LocalDate.parse("2023-02-22");//Imprime a data que eu passo para o objeto
		LocalDateTime d05 = LocalDateTime.parse("2023-02-22T01:30:26");//Imprime a data e hora que eu passo para o objeto
		Instant d06 = Instant.parse("2023-02-22T01:30:26Z");//Imprime a data e hora que eu passo para o objeto com o padrão GMT - Horario de Londres

		for (String s : ZoneId.getAvailableZoneIds()) {//Aqui me retorna varios fuzo horários
			System.out.println(s);
		}
		
		
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());//Aqui converto meu horário GMT-Global, para meu horário local, considerando o fuso horário
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));//Convertendo meu horário GMT, para horário de Portugal
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());//Conversão data e hora GMT para meu minha hora e data local
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Jamaica"));//Conversão data e hora GMT, para outros paises
		
		System.out.println("R1 = " + r1);
		System.out.println("R2 = " + r2);
		System.out.println("R3 = " + r3);
		System.out.println("R4 = " + r4);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());//Extraindo somente o dia 
		System.out.println("d04 mês = " + d04.getMonthValue());//Extraindo somente o mês
		System.out.println("d04 ano = " + d04.getYear());//Extraindo somente o ano
		
		System.out.println("d05 hora = " + d05.getHour());//Extraindo somente a hora
		System.out.println("d05 minutos = " + d05.getMinute());//Extraindo somente a hora
		
		
	}
}