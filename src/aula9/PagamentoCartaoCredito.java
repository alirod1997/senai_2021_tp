package aula9;

public class PagamentoCartaoCredito implements TipoPagamentoExecucao {

	@Override
	public float pagar(float valorPagamento) {
		
		return valorPagamento * 0.05f;
		
	}

}
