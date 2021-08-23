package senai_2021_tp_aula1;

//implementação de contrato/interface 
//Isso é um contrato
public interface Conta {
	// esses métodos não foram implementados apenas criados, a implementação deverá
	// ser feita através das classes que se derivarem deste contrato.
	public abstract void depositar(float valor);

	public abstract void sacar(float valor);

}
