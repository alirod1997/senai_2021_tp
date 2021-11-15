package aula15_APS;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainAula15APS {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Boleto> lista = new ArrayList<Boleto>();

		while (true) {
			Boleto boleto = new Boleto();
			MinhaThread thread = new MinhaThread();
			thread.boleto = boleto;
			thread.start();

			String selecione = JOptionPane.showInputDialog("SELECIONA UMA OPCAO\n1-Cadastrar Boleto de cobrança"
					+ "\n2-Mostrar informações dos boletos" + "\n3-Sair");
			if (selecione.equals("1")) {
				boleto.codigoBoleto = JOptionPane.showInputDialog("Insira o codigo do boleto");
				boleto.nomeCliente = JOptionPane.showInputDialog("Nome do titular");
				String total = JOptionPane.showInputDialog("valor a pagar");
				boleto.valorBoleto = Double.parseDouble(total);
				lista.add(boleto);

			} else if (selecione.equals("2")) {
				JOptionPane.showMessageDialog(null, boleto);
			} else if (selecione.equals("3")) {
				JOptionPane.showMessageDialog(null, lista);
				break;
			}
		}

	}
}
