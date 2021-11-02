package aula12_threads_introducao;

public class MainThread {

	public static void main(String[] args) {
		// thread precisa ser instanciada
		MinhaThread thread1 = new MinhaThread("coleta dos dados");
		thread1.start(); // ao chamarmos o metodo start, de fato o sistema começa a executar a thread

		MinhaThread thread2 = new MinhaThread("validação dos dados");
		thread2.start(); // ao chamarmos o metodo start, de fato o sistema começa a executar a thread

		MinhaThread thread3 = new MinhaThread("tratamento dos dados");
		thread3.start(); // ao chamarmos o metodo start, de fato o sistema começa a executar a thread

		System.out.println("fim do programa");
	}

}

