package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha =
			new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
				
		while(true) {
			
			/*da certo antes e depois do syncronized. Só tem que estar dentro do while()true*/
			Iterator iteracao = pilha_filha.iterator();
			
			synchronized (pilha_filha) { /*Bloquear o acesso a esta lista por outro processos*/
				
						
				while (iteracao.hasNext()) { /*Enquanto conter dados na lista irá processar*/
					
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); /*Pega o ojeto atual*/
					
					/*Processar 10 mil notas fiscais*/
					/*Gerar uma lista enorme de PDF*/
					/*Gerar um envio em massa de mail*/
					
					System.out.println("--------------------------------------------------");
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());
	
					
					iteracao.remove();
					
					try {
						Thread.sleep(1000); /*Dar um tempo para descarga de memoria*/
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
			
			try {
				Thread.sleep(1000); /*Processou toda a lista dá um tempo pra limpesa de memória*/
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		
	}

}
 