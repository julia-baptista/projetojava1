package cursojava.thread;

import javax.swing.JOptionPane;

import org.apache.poi.util.SystemOutLogger;

public class AulaThread2 {
	public static void main(String[] args) throws InterruptedException {
		
		/*Thread processando em paralelo do envio do email*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		
		//****************DIVISÃO DAS THREADS*******************************//
		
		
		
		/*Thread processando em paralelo do envio de nota fiscal*/
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		
	
		/*Codigo do sistema do usuário continua o fluxo de trabalho*/
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
		/*Fluxo do sistema, cadastro de venda, um emissão de nota fiscal, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}
	
	
	
	private static Runnable thread1 = new Runnable() {
		
		
		@Override
		public void run() {
			
			/*Código da rotina que eu quero executar em paralelo*/
			for(int pos = 0; pos < 10; pos++) {
				
				System.out.println("Executando alguma rotina, por exemplo envio de email");
				
				/*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			/*Código da rotina que eu quero executar em paralelo*/
			for(int pos = 0; pos < 10; pos++) {
				
				System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal");
				
				/*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			/*Fim do codigo em paralelo*/
			
		}
		
	};
}
