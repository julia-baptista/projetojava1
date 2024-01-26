package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();			
		Date date = new Date();
		
		
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
		
		
		System.out.println("Dia do mês: " + date.getDate()); /* dia do mês*/
		System.out.println("Calendar do mês: " + calendar.get(Calendar.DAY_OF_MONTH)); /* dia do mês*/
		
		
		System.out.println("Dia da semana: " + date.getDay()); /*dia da semana*/
		System.out.println("Calendar da semana: " + (calendar.get(Calendar.DAY_OF_WEEK) - 1)); /*dia da semana*/
		
		
		System.out.println("Hora do dia: " + date.getHours()); /*hora*/
		System.out.println("Calendar Hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY)); /*hora*/
		
		
		System.out.println("Minuto da hora: " + date.getMinutes()); /*minutos*/
		System.out.println("Calendar Minuto da hora: " + calendar.get(Calendar.MINUTE)); /*minutos*/
		
		
		System.out.println("Segundos: " + date.getSeconds()); /*segundos*/
		System.out.println("Calendar segundos: " + calendar.get(Calendar.SECOND)); /*segundos*/
		
		
		System.out.println("Ano: " + (1900 + date.getYear())); /*segundos*/
		System.out.println("Calendar Ano: " + calendar.get(Calendar.YEAR)); /*segundos*/
		
		
		
		/*----------Simple Date Format ---------------*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("Data em formato padrão: " + simpleDateFormat.format(date));
		System.out.println("Calendar em formato padrão: " + simpleDateFormat.format(calendar.getTime()));
		
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Data em formato para banco de dados: " + simpleDateFormat.format(date));
		System.out.println("Calendar em formato para banco de dados: " + simpleDateFormat.format(calendar.getTime()));
		
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1987-10-18")); /*Converte string para objeto data*/
		
		
		
		
	}

}
