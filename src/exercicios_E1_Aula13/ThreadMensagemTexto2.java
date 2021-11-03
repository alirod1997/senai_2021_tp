package exercicios_E1_Aula13;

public class ThreadMensagemTexto2 extends Thread {

	public void run() {
		/*
		 * Quando o usuário selecionar a 2 opção, deve ser criado uma thread que simula
		 * o envio de mensagem, onde deve mostrar na console a mensagem “Enviando
		 * mensagem”, por 5x, a cada 3 segundo.
		 */
		for (int i = 0; i< 5; i++){

			try {
				System.out.println("enviado mensagem");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
