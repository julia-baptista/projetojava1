package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.SystemOutLogger;

public class ApachePoiEditando {
	
	public static void main(String[] args) throws Exception {
		
		/*Editando arquivo*/
		
		File file = new File("/home/samsung/eclipse-workspace/eclipse-new-workspace/projetojava1/projetojava1/src/cursojava/arquivos/arquivo_excel.xls");
		
		FileInputStream entrada = new FileInputStream(file);
		
		HSSFWorkbook hssfWorbook = new HSSFWorkbook(entrada); /*Prepara a entrada do arquivo de excel*/
		
		HSSFSheet planilha = hssfWorbook.getSheetAt(0);
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while(linhaIterator.hasNext()) { /*Enquanto tiver linha*/
			
			Row linha = linhaIterator.next(); /*Daddos da pessoa na linha*/
			
			int numeroCelulas = linha.getPhysicalNumberOfCells(); /*Quantidade de celulas*/

			/* Adicionando celula*/
			Cell cell = linha.createCell(numeroCelulas);/*Cria nova celula na linha*/
			cell.setCellValue("5.487,20");
			
			/*Alterando célula já existente*/
			String valorCelula = linha.getCell(0).getStringCellValue();
			linha.getCell(0).setCellValue(valorCelula + " da Silva");
			
		}
		
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planilha atualizada");
	}

}
