package aula6_exer_LOG_Solid;

public class Calculadora {

	// Inserir uma implementacao de Log
	private Log log;
	
	
	public int somar(int a, int b) {
		log.log("CHAMANDO SOMA"); 
		return a + b;
	}
	
	public int subtrair(int a, int b) {
		log.log("CHAMANDO SUBTRAIR"); 
		return a - b;
	}

	public void setLog(Log log) {
		this.log = log;
	}
	
}
