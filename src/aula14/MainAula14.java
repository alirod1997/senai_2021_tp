package aula14;

public class MainAula14 {

	public static void main(String[] args) throws InterruptedException {
		ImprimeNumero2 imprime = new ImprimeNumero2();
		imprime.start();
		imprime.join(); //usando o join, o compilador só executa os passos seguintes quando a thread finalizar .
		
		//se criarmos outra thread e ele executa de forma sequencial, ex thread 1,2,3 ...
		ImprimeNumero2 thread = new ImprimeNumero2();
		thread.start();
		thread.join();
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main"+i);
			Thread.sleep(1000);
		}
	}

}
