package aula14;

public class Aula14ex_1 extends Thread {

	public Aula14ex_1() {}

	public Aula14ex_1(String nomeThread) {
		super(nomeThread);
	}
	
	public void run() {		
		int i = 0;
		while (i < 5) {
			/* try-catch deve ser usado por causa da suspensao da thread (sleep), 
			pois gera excessão*/ 
			try {
				System.out.println(getName() + ":" + i++);
				Thread.sleep(2000); //2 segundos 
			} catch (Exception e) {
				e.printStackTrace();
			} 
			
		}
	}

}
