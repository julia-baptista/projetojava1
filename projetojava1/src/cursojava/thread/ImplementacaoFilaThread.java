package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila =
							new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	
	
	@Override
	public void run() {	
		
		System.out.println("Fila rodando");
		
		while(true) {
		
		synchronized (pilha_fila) { /*Bloquear o acesso a esta lista por outro processo*/
			
			Iterator<ObjetoFilaThread> iteracao = pilha_fila.iterator();
			while(iteracao.hasNext()) { /*Enqunato conter dados na lista irá processar*/
				
				ObjetoFilaThread processar = iteracao.next(); /*Pega o objeto atual*/
				
				/*Processar 10 milnotas fiscais*/
				/*Gerar uma lista enorme de PDF*/
				/*Gerar um envio em massa de email*/
				
				System.out.println("------------------------------------------------------------------------");
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				
				iteracao.remove();
				
				
				try {
					Thread.sleep(100); /*Dar um tempo pra descarga de memoria*/
				} catch(InterruptedException e) {
					e.printStackTrace();
				}			
				
			}
		}
			
			try {
				Thread.sleep(1000); /*Dar um tempo pra descarga de memoria*/
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
			
			
		}
		
}	





