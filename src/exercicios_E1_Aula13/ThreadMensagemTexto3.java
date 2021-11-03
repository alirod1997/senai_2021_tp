package exercicios_E1_Aula13;

public class ThreadMensagemTexto3 extends Thread {
	public String mensagem;
	public ThreadMensagemTexto3() {

	}

	public ThreadMensagemTexto3(String nomeThreadMsg3, String mensagem) {
		super(nomeThreadMsg3);
		this.mensagem = mensagem;
	}

	public void run() {

		for (int i = 0; i < 3; i++) {

			try {
				System.out.println("Enviando whats MINHA_MENSAGEM");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
