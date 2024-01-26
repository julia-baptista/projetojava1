package cursojava.datas;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava9 {
	
	public static void main(String[] args) {
		
		LocalDate dataAntiga = LocalDate.of(2019, 2, 7); // pode usaro parse
		
		LocalDate dataNova = LocalDate.of(2021, 7, 4); // pode usar o parse
		
		System.out.println(dataNova.isAfter(dataAntiga));
		System.out.println(dataNova.isBefore(dataAntiga));
		System.out.println(dataNova.isEqual(dataAntiga));
		
		
		Period periodo = Period.between(dataAntiga, dataNova);		
		
		System.out.println(periodo.getYears());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getDays());
		System.out.println(periodo.toTotalMonths());
		System.out.println();
		System.out.println();
		
		
	}

}
