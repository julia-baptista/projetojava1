package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*Thread processando em paralelo do envio de email*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		//*********************************DIVISÃO DAS THREADS
		
		
		Thread threadNFE = new Thread(thread2);
		threadNFE.start();
		
		
		/*Thread processando em paralelo do envio de nota fiscal*/
//		 new Thread() {
//			
//			public void run() {
//				
//				/*Código da rotina que eu quero executar em paralelo*/
//				for (int pos = 0; pos < 10; pos++) {
//					
//					/*Quero executar esse envio com um tempo de parada de 1s*/
//					System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal");
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//				/*Fim do código em paralelo*/
//				
//			}
//			
//		}.start();
		

		
		/*Codigo do sistema do usuário continua o fluxo de trabalho*/
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
		
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			/*Código da rotina que eu quero executar em paralelo*/
			for (int pos = 0; pos < 10; pos++) {
				
				/*Quero executar esse envio com um tempo de parada de 1s*/
				System.out.println("Executando alguma rotina, por exemplo envio de e-mail");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			/*Fim do código em paralelo*/
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			/*Código da rotina que eu quero executar em paralelo*/
			for (int pos = 0; pos < 10; pos++) {
				
				/*Quero executar esse envio com um tempo de parada de 1s*/
				System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			/*Fim do código em paralelo*/		
			
		};
	};

}
