package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2023-02-22");//Imprime a data que eu passo para o objeto
		LocalDateTime d05 = LocalDateTime.parse("2023-02-22T01:30:26");//Imprime a data e hora que eu passo para o objeto
		Instant d06 = Instant.parse("2023-02-22T01:30:26Z");//Imprime a data e hora que eu passo para o objeto com o padrão GMT - Horario de Londres

		LocalDate pastWeek = d04.minusDays(7);// Voltando 7 dias, pastWeek(semana passada)
		LocalDate nextWeek = d04.plusDays(7);// Adiantando 7 dias, nextWeek(semana que vem)
		
		LocalDateTime previousweekwithtime = d05.minusDays(7);// Voltando 7 dias com hora, pastWeek(semana passada)
		LocalDateTime nextweekwithtime = d05.plusDays(7);// Adiantando 7 dias com hora, nextWeek(semana que vem)
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);// Voltando 7 dias usando padrão GMT
		Instant nexttWeekInstant = d06.plus(7, ChronoUnit.DAYS);// Adiantando 7 dias usando padrão GMT
		
		System.out.println("Past Week(Semana Passada) = " + pastWeek);
		System.out.println("Next Week(Semana que vem) = " + nextWeek);
		
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println("Previous Week With Time(semana anterior com hora) " + previousweekwithtime);
		System.out.println("Next Week With Time(próxima anterior com hora) " + nextweekwithtime);
		
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println("Past Week Instant(Semana passada Instantânea-GMT) = " + pastWeekInstant);
		System.out.println("Next Week Instant(Próxima passada Instantânea-GMT) = " + nexttWeekInstant);
		
		//Duração entre duas datas e horas
		
		Duration t1 = Duration.between(pastWeek.atStartOfDay(), d04.atTime(0, 0) );//Nesse caso preciso fazer essa conversão
		Duration t2 = Duration.between(previousweekwithtime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("T1 dias = " + t1.toDays());
		System.out.println("T2 dias = " + t2.toDays());
		System.out.println("T3 dias = " + t3.toDays());
		System.out.println("T4 dias = " + t4.toDays());

		
	}

}
