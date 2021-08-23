package senai_2021_tp_aula1;

//implementa��o de contrato/interface 
//Isso � um contrato
public interface Conta {
	// esses m�todos n�o foram implementados apenas criados, a implementa��o dever�
	// ser feita atrav�s das classes que se derivarem deste contrato.
	public abstract void depositar(float valor);

	public abstract void sacar(float valor);

}
