package aula14;

public class ImprimeNumero2 extends Thread {

	public void run() {
		int i = 0;
		while (i < 10) {
			/* try-catch deve ser usado por causa da suspensao da thread (sleep), 
			pois gera excessão*/ 
			try {
				System.out.println(getName() + ":" + i++);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
