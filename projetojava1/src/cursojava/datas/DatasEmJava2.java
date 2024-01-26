package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava2 {
	
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021");
		
		Date dataHoje = simpleDateFormat.parse("07/04/2021");
		
		if(dataVencimentoBoleto.after(dataHoje)) {
			System.out.println("Boleto não vencido");
		} else {
			System.out.println("Boleto vencido - URGENTE");
		}
		
	}

}
