package exercicioE2_Aula8;

public class ProdutoFacade {
	private ModuloBancoDados bancodados = new ModuloBancoDados();
	private ModuloEnvioEmail envioemail = new ModuloEnvioEmail();
	
	public void efetuarCompra(Produto produto) {
		System.out.println("--- disparando facade ! ---");
		bancodados.salvarBanco(produto);
		envioemail.envioEMail(produto);
	}
	
}
