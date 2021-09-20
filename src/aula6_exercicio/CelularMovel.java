package aula6_exercicio;

public class CelularMovel implements Aparelho, Aparelho_4g {

	@Override
	public void ConexaoInternet() {
		System.out.println("você está conectado a internet !");
	}

	@Override
	public void ligação() {
		System.out.println("telefone movel");
		System.out.println("você esta em ligaçao");

	}

	@Override
	public void mensagem() {
		System.out.println("telefone movel");
		System.out.println("Mensagem recebida");
	}

}
