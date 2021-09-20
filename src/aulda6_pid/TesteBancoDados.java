package aulda6_pid;

public class TesteBancoDados {
	private BancoDados banco;

	//construtor que recebe uma abstracao do banco de dados em vez de implementacao
	public TesteBancoDados(BancoDados banco) {
		this.banco = banco;
	}
	
	
	public void salvando() {
			banco.salvar();
	}

	//metodo SET que tem objetivo setar uma implementacao para uso.
	public void setBanco(BancoDados banco) {
		this.banco = banco;
	}
	
}
