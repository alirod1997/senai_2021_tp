package exercicios_E1_Aula13;

import java.util.List;

public class ThreadVerificadora extends Thread {

	private List<Produto> listaProduto;

	public ThreadVerificadora(List<Produto> lista) {
		this.listaProduto = lista;
	}

	public void run() {
		while (true) {
			try {
				if (listaProduto.isEmpty()) {
					System.out.println("lista não contem nenhum produto cadastrado");
				}else{
					System.out.println("lista contém "+listaProduto.size()+"produtos cadastrados");//retorna a quantidade de produtos 
				}
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

	}
}
