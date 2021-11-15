package aula15_APS;

public class Boleto {
	public String codigoBoleto;
	public String nomeCliente;
	public String emailCliente;
	public double valorBoleto;
	public boolean boletoEnviado = true;

	public Boleto() {
	}
	
	public String toString() {
		return "Codigo do boleto: " + codigoBoleto + "\nNome do titular: " + nomeCliente + "\nValor Total a pagar: "
				+ valorBoleto+"\nBoleto"+boletoEnviado;
	}
}
