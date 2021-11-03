package exercicios_E1_Aula13;

import javax.swing.JOptionPane;

import aulda6_pid.TesteBancoDados;

public class MainExer4 {

	public static void main(String[] args) {

		while (true) {
			String selecione = JOptionPane.showInputDialog(
					"1 .Enviar email\n" + "2. Enviar mensagem (torpedo)\n" + "3. Enviar whats\n" + "4. Sair");
			switch (selecione) {
			case "1":
				ThreadMensagemTexto1 thread1 = new ThreadMensagemTexto1();
				thread1.start();
				break;
			case "2":
				ThreadMensagemTexto2 thread2 = new ThreadMensagemTexto2();
				thread2.start();
				break;
			case "3":
				/*
				 * Quando o usuário selecionar a 3 opção, deve aparecer outra tela, para o
				 * usuário passar o texto a ser inserido na mensagem. Após pegue essa String e
				 * passe para a thread que simula o envio de mensagem de whats, onde deve
				 * mostrar na console a mensagem “Enviando whats MINHA_MENSAGEM”, por 3x, a cada
				 * 1 segundo. Junto com a mensagem, mostre o nome da thread. Se desejar, pode
				 * colocar um popUp, para inserir uma mensagem.
				 */
				String texto = JOptionPane.showInputDialog("digite a mensagem de texto: ");
				ThreadMensagemTexto3 thread3 = new ThreadMensagemTexto3("thread whats", texto);
				thread3.start();
				JOptionPane.showMessageDialog(null, texto);

			default:
				System.exit(1);
			}
		}
	}

}
