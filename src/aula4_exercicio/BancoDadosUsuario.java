package aula4_exercicio;

import java.util.ArrayList;
import java.util.List;

public class BancoDadosUsuario {

	private List<Usuario> lista = new ArrayList<>();
	
	public void salvar (Usuario usuario) {
		lista.add(usuario);
	}
					
}
