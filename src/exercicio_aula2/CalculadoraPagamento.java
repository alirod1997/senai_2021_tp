package exercicio_aula2;
// INSERIR PACOTE SE NECESSARIO

public class CalculadoraPagamento {
    
    float resultado = 0; 
    public CalculadoraPagamento(CalculadoraPagamentoParameter parameterObject){
        Funcionario funcionario = new Funcionario();
        funcionario.dataNascimento = parameterObject.dataNascimento;
        funcionario.idade = parameterObject.idade;
        funcionario.nome = parameterObject.nome;
        funcionario.salario = parameterObject.salario;    
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
    private float calculaSalario(Funcionario funcionario){
        float resultado = 0;
        if(funcionario.salario < 1000){
            float umPorcento = 0.1f;
			resultado = (funcionario.salario * umPorcento) + funcionario.salario;
        }else{
            float doisPorcento = 0.2f;
			resultado = (funcionario.salario * doisPorcento) + funcionario.salario;
        }
        
        return resultado;        
    }
    
}




       



