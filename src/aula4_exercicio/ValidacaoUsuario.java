package aula4_exercicio;

public class ValidacaoUsuario {
	public void validar(Usuario usuario) throws IllegalArgumentException{
		
		if(usuario == null ) {
			throw new IllegalArgumentException("usuario esta null");
		}
		if(usuario.nome.equals("")) {
			throw new IllegalArgumentException("nome em branco");
		}	
	}
}
