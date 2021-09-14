package aula4_exercicio;

public class UsuarioService {
	
	private BancoDadosUsuario bancoDadosUsuario = new BancoDadosUsuario();
	private ValidacaoUsuario validador = new ValidacaoUsuario();
	
	
	public boolean salvar (Usuario usuario) {
		validador.validar(usuario);
		bancoDadosUsuario.salvar(usuario);
		return true;
	}
	
}
