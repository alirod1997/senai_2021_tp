package aula12_threads_introducao;

public class Exer_Threads extends Thread{
	public Exer_Threads() {}
	
	public Exer_Threads(String nomeThread) {
		super(nomeThread);
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName()+" "+i);
		}
	}
}
