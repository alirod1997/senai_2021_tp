package aula8;

public class PedidoFacade {
	//instanciamos dentro da classe facade, ao invez da main
	private ModuloEstoque moduloestoque = new ModuloEstoque();
	private ModuloFinanceiro modulofinanceiro = new ModuloFinanceiro();
	private ModuloPosVenda moduloposvenda = new ModuloPosVenda();
	
	public void realizarPedido(Pedido pedido) {
		//dentro deste metodo teremos todo o processo necessario para realizarmos a orquestração de um pedido
		moduloestoque.enviarPedido(pedido);
		modulofinanceiro.faturar(pedido);
		moduloposvenda.agendarContatoCliente(pedido);
		
		//implementação generica
		System.out.println("**Pedido facade**");
		System.out.println("chamando realizar pedido: "+pedido.Id);
		
		
	}
}
