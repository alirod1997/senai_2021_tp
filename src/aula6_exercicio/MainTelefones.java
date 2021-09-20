package aula6_exercicio;

public class MainTelefones {

	public static void main(String[] args) {
		TelefoneFixo telefone = new TelefoneFixo();
		CelularMovel celular = new CelularMovel();

		movelPop(celular);
		fixoPop(telefone);

	}

	private static void movelPop(CelularMovel celular) {
		System.out.println("-----------------------");
		celular.ConexaoInternet();
		celular.ligação();
		celular.mensagem();
		System.out.println("-----------------------");
	}

	private static void fixoPop(TelefoneFixo telefone) {
		System.out.println("-----------------------");
		telefone.ligação();
		telefone.mensagem();
		System.out.println("-----------------------");
	}
}
