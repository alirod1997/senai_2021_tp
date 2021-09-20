package aulda6_pid;

public class BancoDadosArquivos implements BancoDados {

	@Override
	public void salvar() {
		System.out.println("salvo nos Arquivos locais!");
	}

	@Override
	public void remover() {
		System.out.println("removido dos Arquivos locais!");
	}

}
