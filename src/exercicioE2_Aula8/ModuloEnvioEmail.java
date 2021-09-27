package exercicioE2_Aula8;

public class ModuloEnvioEmail {

	public void envioEMail(Produto produto) {
		System.out.println("--------------------------------------------------------");
		System.out.println("***Novo Email Recebido***");
		System.out.println("***Você comprou um item da categoria: " + produto.categoria);
		System.out.println("***Pedido de numero > " + produto.Id + "\n***" + produto.nome + "\n***No valor de > R$"
				+ produto.valor + "\nCompra Concluida com sucesso!");
	}

}
