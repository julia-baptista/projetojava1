package cursojava.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEmJava10 {
	
	public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		System.out.println("Mais 5 dias : " + dataBase.plusDays(5));
		
		System.out.println("Mais 5 semanas : " + dataBase.plusWeeks(5));
		
		System.out.println("Mais 5 anos : " + dataBase.plusYears(5));
		
		System.out.println("Mais 2 meses : " + dataBase.plusMonths(2));
		
		System.out.println("Menos um ano : " + dataBase.minusYears(1));
		
		//month
		//day
		
		
		for (int mes = 1; mes <= 12; mes ++) {
			
			dataBase =dataBase.plusMonths(1);
			System.out.println(dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "- mês: " + mes);
		}
	}

}