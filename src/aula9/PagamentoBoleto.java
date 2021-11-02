package aula9;

public class PagamentoBoleto implements TipoPagamentoExecucao{
	
	@Override
	public float pagar(float valorPagamento) {
		return valorPagamento;
	}

}
