package cursojava.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava7 {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Data atual" + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana - nome : " + localDate.getDayOfWeek());
		System.out.println("Dia da semana - número : " + localDate.getDayOfWeek().ordinal());
		
		
		
		System.out.println("Dia do mês : " + localDate.getDayOfMonth());
		System.out.println("mês : " + localDate.getMonthValue());
		System.out.println("mês : " + localDate.getMonth());
		
		
		System.out.println("Ano : " + localDate.getYear());
		
		
		
	}

}
