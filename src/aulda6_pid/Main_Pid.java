package aulda6_pid;

public class Main_Pid {

	public static void main(String[] args) {
		//instanciamos o tipo de banco na qual desejamos trabalhar
		BancoDadosNuvem bdnuvem = new BancoDadosNuvem();
		
		//nessa etapa ao instanciar um objeto
		//passamos uma implementacao no construtor que irá setar o tipo de banco desejado para uso
		//
		System.out.println("\n###################################");
		TesteBancoDados testebanco = new TesteBancoDados(bdnuvem);		
		testebanco.salvando();

	
		System.out.println("\n###################################");
		//digamos que eu não queira mais salvar no banco em nuvem
		//instanciamos o servico de banco na qual desejamos trabalhar, por exemplo SQL
		BancoDadosSQL bdsql = new BancoDadosSQL();
		//e setamos via set o banco desejado
		testebanco.setBanco(bdsql);
		testebanco.salvando(); //aciono o metodo salvar que ira salvar no novo servico setado
	
	}

}
