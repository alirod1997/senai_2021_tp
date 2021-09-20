package aula7;

public class MainAula7 {

	public static void main(String[] args) {
		//IMPORTANTE
		//ao instanciar um objeto não usaremos o parametro "new"
		//agora usamos o getInstance puxando da classe
		ConfiguracoesSistema config1 =  ConfiguracoesSistema.getInstance();
		//chamou metodo HoraServidor
		System.out.println(config1.HoraServidor());
		
		//este codigo não vai funcionar novamente pois já tem uma instancia
		//pra isso que usamos o padrao singleton
		ConfiguracoesSistema config2 =  ConfiguracoesSistema.getInstance();
		ConfiguracoesSistema config3 =  ConfiguracoesSistema.getInstance();
		//
		System.out.println(config1.DiretorioConfiguracao());
		
		
		
		
		
		
	}

}
