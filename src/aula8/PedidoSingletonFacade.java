package aula8;

public class PedidoSingletonFacade {
	
	private static PedidoSingletonFacade instance;	
	private ModuloEstoque moduloestoque = new ModuloEstoque();
	private ModuloFinanceiro modulofinanceiro = new ModuloFinanceiro();
	private ModuloPosVenda moduloposvenda = new ModuloPosVenda();
	
	private PedidoSingletonFacade(){
		
	}
	
	public  static PedidoSingletonFacade getinstance() {
		if (instance == null) {
			instance = new PedidoSingletonFacade();
		}
		return instance;
	}
	
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
