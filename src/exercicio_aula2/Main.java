package exercicio_aula2;
// INSERIR PACOTE SE NECESSARIO

public class Main {

	public static void main(String[] args) {
		CalculadoraPagamento c = new CalculadoraPagamento("maria",
                        30, "26/06/1990", 500);
                float ret = c.retornaCalculoFuncionario();
                System.out.println("salario: " + ret);
	}

}
