package exercicios_E1_Aula13;

public class ThreadMensagemTexto1 extends Thread {

	public void run() {
		/*
		 * Quando o usuário selecionar a 1 opção, deve ser criado uma thread que simula
		 * o envio de email, onde deve mostrar na console a mensagem “Enviando email”,
		 * por 10x, a cada 1 segundo.
		 */

		for (int i = 0; i< 10; i++) {

			try {
				System.out.println("enviado mensagem");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
