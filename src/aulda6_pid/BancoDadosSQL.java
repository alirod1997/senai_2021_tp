package aulda6_pid;

public class BancoDadosSQL implements BancoDados {

	@Override
	public void salvar() {
		System.out.println("salvo no Bando de Dados SQL!");
	}

	@Override
	public void remover() {
		System.out.println("removido do Bando de Dados SQL!");
	}

}
