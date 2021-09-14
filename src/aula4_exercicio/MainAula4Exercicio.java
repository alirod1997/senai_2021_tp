package aula4_exercicio;

public class MainAula4Exercicio {

	public static void main(String[] args) {
		CalculoPagamentoUsuario calcula = new CalculoPagamentoUsuario();
		UsuarioService service = new UsuarioService();
		
		Usuario usuario = new Usuario();
		usuario.nome = "Pedrinho";
		usuario.cargo = "desenvolvedor";
		usuario.salario = 200f;
		
		PagamentoUsuarioProfessor pagamento = new PagamentoUsuarioProfessor(usuario);
		float novoSalario = calcula.calcular(pagamento);
		usuario.salario = novoSalario;
		
		service.salvar(usuario);
		
		System.out.println("novo salario "+ usuario.salario);
	}

}
