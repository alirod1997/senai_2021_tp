package exercicios_E1_Aula13;

public class Ex1_thread_imprime_numeros extends Thread {

	public Ex1_thread_imprime_numeros() {
	}

	public Ex1_thread_imprime_numeros(String nomeThread) {
		super(nomeThread);
	}

//	Crie uma thread que imprima infinitamente os números na console, começando pelo n. 1. Suspenda a thread a cada 3 segundos.
	public void run() {
		int contador = 1;

		while (true) {

			try {
				System.out.println(contador);
				contador ++;
				System.out.println(getName());				
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
