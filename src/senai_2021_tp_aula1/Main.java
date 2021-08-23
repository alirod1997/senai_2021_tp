package senai_2021_tp_aula1;

public class Main {

	public static void main(String[] args) {
		// Instanciamos um objeto pessoa
		Pessoa marina = new Pessoa();
		marina.nome = "Marina Silva";
		//instanciamos um objeto endereço para pessoa
		Endereco enderecomarina = new Endereco();
		enderecomarina.nomeRUa="assis brasil";
 		
		//fazendo o vinculo das classes instanciadas 
		marina.endereco = enderecomarina ;
		
		System.out.println("Pessoa : "+ marina.nome);
		System.out.println("EndereÃ§o : "+ enderecomarina.nomeRUa);
		
		//vamos fazer uma herança
		PessoaJuridica pj = new PessoaJuridica();
		pj.nome="faculdade senai";
		pj.cnpj="01293848492343";
		Endereco enderecopj =new Endereco();
		enderecopj.nomeRUa= "Av.assis brasil 2008";
		pj.endereco = enderecopj; //criando vinculo
		
		PessoaFisica pf = new PessoaFisica();
		pf.nome="Ednaldo pereira";
		pf.cpf="0129300013";
		Endereco enderecopf =new Endereco();
		enderecopf.nomeRUa= "Rua Francisco machado 201";
		pf.endereco = enderecopf; //criando vinculo
		
		System.out.println("Pessoa Juridica "+pj.nome);
		System.out.println("endereço pj"+pj.endereco.nomeRUa);
		
		System.out.println("Pessoa Fisica"+pf.nome);
		System.out.println("endereço pf"+pf.endereco.nomeRUa);
		
		
		//exemplo de polimorfismo
		System.out.println();
		mostraNomePessoa(pj);
		mostraNomePessoa(pf);
		
		//vamos fazer usos de interfaces/contrato junto com polimosfismo
		System.out.println();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		depositarSacaConta(cc);
		depositarSacaConta(cp);
		
	}

		public static void depositarSacaConta(Conta conta) {
			conta.depositar(100);
			conta.sacar(500);
		}
	
	public static void mostraNomePessoa(Pessoa pessoa) {
		System.out.println("o nome da pessoa é : "+pessoa.nome);
	}
}
