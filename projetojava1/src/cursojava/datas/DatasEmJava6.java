package cursojava.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasEmJava6 {
	
	public static void main(String[] args) {
		/*Nova API de data a partir do Java 8*/
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data Atual : " + dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora Atual : " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm")));
		
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		
		System.out.println("Data e hora atual : " + dataAtualHoraAtual.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println("hora atual : " + dataAtualHoraAtual.format(DateTimeFormatter.ISO_TIME));
		System.out.println("Data e hora atual : " + dataAtualHoraAtual.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println("Data e hora atual : " + dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
	}

}
