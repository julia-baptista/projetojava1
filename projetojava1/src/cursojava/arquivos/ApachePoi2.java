package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi2 {
	
	public static void main(String[] args) throws IOException {
		
		/*Ler arquivos*/
	
		FileInputStream entrada =
				new FileInputStream(new File("/home/samsung/eclipse-workspace/eclipse-new-workspace/projetojava1/projetojava1/src/cursojava/arquivos/arquivo_excel.xls"));
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); /*Pega a entrada do arquivoexcel para ler*/
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);/*Pega a primeira planilha do nosso arquivo excel*/
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		
		while(linhaIterator.hasNext()) { /*Enquanto tiver tinha no aequivo excel*/
			
			Row linha = linhaIterator.next(); /*Dados da pessoa na linha*/
			Iterator<Cell> celulas = linha.iterator();
			
			Pessoa pessoa = new Pessoa();
			
			
			
			while(celulas.hasNext()) { /*Percoreras celulas*/
				
				Cell cell = celulas.next();
				
				
				switch (cell.getColumnIndex()) {
				case 0: 
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2:
					//pessoa.setIdade(Integer.parseInt(cell.getStringCellValue()));
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
				}
			}/*Fim das celulas da linha*/
			
			pessoas.add(pessoa);
			
		}
		
		entrada.close();
		
		for (Pessoa pessoa : pessoas) { /*Poderia gravar no banco de dados ou mandar email*/
			System.out.println(pessoa);
		}
		
	}

}
