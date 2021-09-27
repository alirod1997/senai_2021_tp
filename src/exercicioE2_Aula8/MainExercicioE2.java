package exercicioE2_Aula8;

public class MainExercicioE2 {

	public static void main(String[] args) {	
		Produto produto = new Produto("Macbook Air", "Informática", 12000f, 12);
		
		//facade acionado 
		ProdutoFacade produtofacade = new ProdutoFacade();
		produtofacade.efetuarCompra(produto);
		
		
	}

}
