package aulda6_pid;

public class BancoDadosNuvem implements BancoDados {

	@Override
	public void salvar() {
		System.out.println("salvo no Bando de Dados na Nuvem!");
	}

	@Override
	public void remover() {
		System.out.println("removido do Bando de Dados na Nuvem!");
	}

}
