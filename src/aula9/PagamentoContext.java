package aula9;

public class PagamentoContext {
	
	public TipoPagamentoExecucao getStrategy(int selecaopagamento) {
		TipoPagamentoExecucao retorno = null;
		if (selecaopagamento == 1) {
			retorno = new PagamentoCartaoCredito();
		}
		if (selecaopagamento == 2) {
			retorno = new PagamentoCartaoDebito();
		}
		if (selecaopagamento == 3) {
			retorno = new PagamentoBoleto();
		}
		return retorno;
	}
		
}
