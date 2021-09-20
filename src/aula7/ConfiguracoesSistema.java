package aula7;

import java.util.Date;

public class ConfiguracoesSistema {
	// para que possamos instanciar um objeto uma unica vez usamos Static
	// Static significa que este objeto/variavel é da classe

	// 2 etapa: criar atributo/variavel do tipo da classe
	private static ConfiguracoesSistema instance;

	// 1 etapa: criacao de um metodo privado
	private ConfiguracoesSistema() {
		System.out.println("criando config do sistema !");
	}

	// 3 etapa: criar metodo publico estatico que de acesso ao cliente : MAIN
	public static ConfiguracoesSistema getInstance() {
		if (instance == null) {
			instance = new ConfiguracoesSistema();
		}
		return instance;
	}

	//metodo simulando o salvamento de configuracao no diretorio local 
	public String DiretorioConfiguracao() {
		return "/home/alisson/Documentos";
	}
	//metodo que simula o retorno da hora do servidor
	public String HoraServidor() {
		return new Date().toGMTString();
	}
	
	
}
