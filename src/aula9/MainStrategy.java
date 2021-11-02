package aula9;

import javax.swing.JOptionPane;

public class MainStrategy {

	public static void main(String[] args) {
		String mensagem = "selecione a forma de pagamento: \n1-debito \n2-credito \n3-boleto bancario";
		
		String opcao = JOptionPane.showInputDialog(mensagem);
		String valor = JOptionPane.showInputDialog("digite o valor da compra ");
		
		PagamentoContext pagamentocontext = new PagamentoContext();
		TipoPagamentoExecucao tipopagamento = new PagamentoContext().getStrategy(Integer.parseInt(opcao));
		
		float valorTotalCompra = tipopagamento.pagar(Float.parseFloat(valor));
		JOptionPane.showMessageDialog(null, "valor total da compra >>> "+ valorTotalCompra);
	}

}
