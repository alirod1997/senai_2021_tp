package aula7Exercicio;

public class ConectaBanco {

	// 2 etapa: criar atributo/variavel do tipo da classe
	private static ConectaBanco instance;

	// 1 etapa: criacao de um metodo privado
	private ConectaBanco() {
		System.out.println("criado conectaBanco");
	}

	// 3 etapa: criar metodo publico estatico que de acesso ao cliente : MAIN
	public static ConectaBanco getInstance() {
		if (instance == null) {
			instance = new ConectaBanco();
		}

		return instance;
	}

	public void conecta() {
		System.out.println("conectado ao banco");
	}
}
