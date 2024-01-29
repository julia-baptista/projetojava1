package cursojava.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {
	
	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(50);
		pessoa1.setNome("Alex egidio");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade(25);
		pessoa2.setNome("Marcos tadeu");
		
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade(40);
		pessoa3.setNome("Maria jesus");
		
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		File arquivo = new File("/home/samsung/eclipse-workspace/eclipse-new-workspace/projetojava1/projetojava1/src/cursojava/arquivos/arquivo.txt");
		File arquivo2 = new File("/home/samsung/eclipse-workspace/eclipse-new-workspace/projetojava1/projetojava1/src/cursojava/arquivos/arquivo.csv");
		
		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		if (!arquivo2.exists()) {
			arquivo2.createNewFile();
		}
		
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		FileWriter escrever_no_arquivo2 = new FileWriter(arquivo2);
		
		
//		for(int i= 1; i <= 10; i++) {
//			 
//			escrever_no_arquivo.write("Texto da minha linha " + i + "\n");
//			
//		}
		
		
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
			escrever_no_arquivo2.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
		}
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo2.flush();
		escrever_no_arquivo.close();
		escrever_no_arquivo2.close();
		
	}

}
