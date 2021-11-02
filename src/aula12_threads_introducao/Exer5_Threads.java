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
			System.out.println("executando a thread " + getName() + new Date());
			String nome = JOptionPane.showInputDialog("digite seu nome: ");
			JOptionPane.showMessageDialog(null, "seu nome é: " + nome);
			if (nome.equals("sair")) {
				break;
			} 
		}
	}
}
