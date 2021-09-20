package aula6_exercicio;

public class TelefoneFixo implements Aparelho {

	@Override
	public void ligação() {
		System.out.println("telefone fixo");
		System.out.println("você esta em ligaçao");
	}

	@Override
	public void mensagem() {
		System.out.println("telefone fixo");
		System.out.println("Mensagem recebida");
	}

}
