package aula12_threads_introducao;

public class MinhaThread extends Thread{
	
	public MinhaThread() {}
	
	public MinhaThread(String nomeThread) {
		super(nomeThread);
	}
	//dentro do metodo run, colocamos o codigo que desejamos que a thread execute em seu tempo de vida
	public void run() {
		System.out.println("minha thread esta executando: " + getName());
	}
	
	
}
