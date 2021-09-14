package aula4_exercicio;

import aula4_exercicio.Usuario;

public class PagamentoUsuarioProfessor implements PagamentoUsuario {
	
	private float ACRESCIMO_PAGAMENTO = 100;
	private Usuario usuario;
	
	public PagamentoUsuarioProfessor(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public float calcular() {
		
		return usuario.salario + ACRESCIMO_PAGAMENTO;	
	}

}
