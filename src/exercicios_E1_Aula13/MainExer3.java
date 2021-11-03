package exercicios_E1_Aula13;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class MainExer3 {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<Produto>();
		ThreadVerificadora thread = new ThreadVerificadora(lista);
		thread.start();
		Produto produto = new Produto();
		while (true) {
			String selecione = JOptionPane.showInputDialog(
					"SELECIONA UMA OPCAO\n 1.Cadastrar Produto (nome e preço)" + "\n2. Remoção do produto\n");
			if (selecione.equals("1")) {
				produto.nomeProduto = JOptionPane.showInputDialog("insira o nome do produtos: ");
				produto.preco = JOptionPane.showInputDialog("insira o preco do produto");
				lista.add(produto);
				JOptionPane.showMessageDialog(null, "Produto: " + produto.nomeProduto + " preço"+produto.preco+" foi adicionado a lista");
			} else if (selecione.equals("2")) {
				lista.remove(produto);
				JOptionPane.showMessageDialog(null, "Produto: " + produto.nomeProduto + " foi removido da lista");
			} else {
				break;
			}
		}

	}
}
