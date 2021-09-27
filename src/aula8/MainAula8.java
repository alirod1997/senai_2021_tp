package aula8;

public class MainAula8 {

	public static void main(String[] args) {
		Pedido pedido = new Pedido("Robson", "tv 39p ", 1200f, 10);
	
//		PedidoFacade pedidofacade = new PedidoFacade();
//		pedidofacade.realizarPedido(pedido);
	
		
		PedidoSingletonFacade pedidosingletonfacade = PedidoSingletonFacade.getinstance();
		pedidosingletonfacade.realizarPedido(pedido);
	}

}
