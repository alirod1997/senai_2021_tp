package exercicio_aula2;
// INSERIR PACOTE SE NECESSARIO

public class CalculadoraPag {
    
    float resultado = 0; 
    public CalculadoraPag(String nome, int idade,
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
        resultado = calcula(funcionario);
    }
    
	void validaFuncionario(Funcionario funcionario) throws Exception{
		if(funcionario.nome.equals("") || funcionario.idade == 0){
			throw new Exception("error funcionario");
		}
	}
	
    public float retornaCalculoFuncionario(){
        return resultado;
    }
    // esse metodo calcula o salario do funcionario
    private float calcula(Funcionario funcionario){
		
		
        float r = 0;
        if(funcionario.salario < 1000){
            r = (funcionario.salario * 0.1f) + funcionario.salario;
        }
        if(funcionario.salario > 1000){
            r = (funcionario.salario * 0.2f) + funcionario.salario;
        }
        
        return r;        
    }
    
}




       



