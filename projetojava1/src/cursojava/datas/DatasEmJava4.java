package cursojava.datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasEmJava4 {
	
	public static void main(String[] args) throws ParseException {
	
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-02-01"), LocalDate.now()); /*Total de dias entre uma data e outra*/
		//WEEKS
		//YEARS
		//MONTHS
		
		System.out.println(dias);
		
	}

}
