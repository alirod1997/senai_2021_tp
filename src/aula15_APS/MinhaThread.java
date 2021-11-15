package aula15_APS;

public class MinhaThread extends Thread {
	Boleto boleto = new Boleto();

	public MinhaThread() {
	}
	//passar o objeto Boleto pelo construtor para iniciar a thread com um valor
	public MinhaThread(Boleto boleto) {
		this.boleto = boleto;
	}

	public void run() {
		while (true) {
			try {
				if (boleto.boletoEnviado == true) {
					System.out.println("enviado o email para o cliente " + boleto.nomeCliente + " referente ao boleto "
							+ boleto.codigoBoleto);
				} else {
					System.out.println("boleto não enviado");
				}
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

	}
}