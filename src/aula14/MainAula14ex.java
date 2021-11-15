package aula14;

public class MainAula14ex {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Implemente 3 Threads (A,B,C), onde cada uma fique suspensa por 2 segundos, e
		 * que seja executada uma após a outra, ou seja, é necessário que cada uma
		 * finalize seu processamento, para iniciar a próxima. O código a ser
		 * implementado nas threads, fica a seu critério.
		 */

		Aula14ex_1 threadA = new Aula14ex_1("A");
		System.out.println("------------------");
		threadA.start();
		threadA.join();

		Aula14ex_1 threadB = new Aula14ex_1("B");
		System.out.println("------------------");
		threadB.start();
		threadB.join();

		Aula14ex_1 threadC = new Aula14ex_1("C");
		System.out.println("------------------");
		threadC.start();
		threadC.join();
		
	}

}
