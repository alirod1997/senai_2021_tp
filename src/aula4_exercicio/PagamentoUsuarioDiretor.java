package aula4_exercicio;

import aula4_exercicio.Usuario;

public class PagamentoUsuarioDiretor implements PagamentoUsuario {
	
	private float ACRESCIMO_PAGAMENTO = 300;
	private Usuario usuario;
	
	public PagamentoUsuarioDiretor(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public float calcular() {
		
		return usuario.salario + ACRESCIMO_PAGAMENTO;
	}

}
