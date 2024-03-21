package cursojava.datas;

import java.time.Duration;
import java.time.Instant;

public class DatasEmJava8 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000); /*Pode ser um processo com um tempo qualquer que não conhecemos*/
		
		Instant ifinal =Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Duração em nano segundos: " + duracao.toNanos());
		System.out.println("Duração em mins: " + duracao.toMinutes());
		System.out.println("Duração em horas: " + duracao.toHours());
		System.out.println("Duração em milisegundos: " + duracao.toMillis());
		System.out.println("Duração em dias: " + duracao.toDays());
	}

}
