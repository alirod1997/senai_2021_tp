package aula9;

public class PagamentoCartaoDebito implements TipoPagamentoExecucao{
	
	@Override
	public float pagar(float valorPagamento) {
		
		return valorPagamento * 0.02f;		
	}

}
