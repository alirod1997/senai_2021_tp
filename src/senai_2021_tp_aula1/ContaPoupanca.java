package senai_2021_tp_aula1;

public class ContaPoupanca implements Conta {
	//ao extender-se do contrato conta
	//métodos criados obrigatoriamente devem ser implementados
	@Override
	public void depositar(float valor) {
		System.out.println("executando deposito de conta poupança " + valor);
	}

	@Override
	public void sacar(float valor) {
		System.out.println("executando saque de conta poupança" + valor);
		
	}

}
