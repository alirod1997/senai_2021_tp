package aula12_threads_introducao;

import java.util.Date;

import javax.swing.JOptionPane;

public class Exer5_Threads extends Thread {
	public Exer5_Threads() {
	}

	public Exer5_Threads(String nomeThread) {
		super(nomeThread);
	}

	public void run() {
		while (true) {
			//suspensao de threads 
			//sempre deve conter o bloco try-catch, pois dispara uma exception
			try {
				Thread.sleep(3000l);//tempo que vai ficar suspenso, segundos
				System.out.println("executando a thread " + getName() + new Date());
				String nome = JOptionPane.showInputDialog("digite seu nome: ");
				JOptionPane.showMessageDialog(null, "seu nome é: " + nome);
				if (nome.equals("sair")) {
					break;
				} 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
