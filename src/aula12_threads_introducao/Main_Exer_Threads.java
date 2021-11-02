package aula12_threads_introducao;

public class Main_Exer_Threads {

	public static void main(String[] args) {
		Exer_Threads thread1 = new Exer_Threads("1°THREAD 1 a 10");
		thread1.start();
		
		Exer_Threads thread2 = new Exer_Threads("2°THREAD 1 a 10");
		thread2.start();
		
		Exer_Threads thread3 = new Exer_Threads("3°THREAD 1 a 10");
		thread3.start();
	}

}
