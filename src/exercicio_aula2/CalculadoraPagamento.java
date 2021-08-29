package exercicio_aula2;
// INSERIR PACOTE SE NECESSARIO

public class CalculadoraPagamento {
    
    float resultado = 0; 
    public CalculadoraPagamento(String nome, int idade,
            String dataNascimento,float salario){
        Funcionario funcionario = new Funcionario();
        funcionario.dataNascimento = dataNascimento;
        funcionario.idade = idade;
        funcionario.nome = nome;
        funcionario.salario = salario;    
		try{
			validaFuncionario(funcionario);
		}catch(Exception i){
			System.out.println("erro na validaçao");
		}
        resultado = calculaSalario(funcionario);
    }
    
	void validaFuncionario(Funcionario funcionario) throws Exception{
		if(funcionario.nome.equals("") || funcionario.idade == 0){
			throw new Exception("error funcionario");
		}
	}
	
    public float retornaCalculoFuncionario(){
        return resultado;
    }
    private float calculaSalario(Funcionario f){
        float r = 0;
        if(f.salario < 1000){
            r = (f.salario * 0.1f) + f.salario;
        }else{
            r = (f.salario * 0.2f) + f.salario;
        }
        
        return r;        
    }
    
}




       



