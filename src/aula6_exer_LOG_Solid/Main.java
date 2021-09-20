package aula6_exer_LOG_Solid;

public class Main {

	public static void main(String[] args) {

		/*
		 * A 1 impl. de log, deve mostrar na console: LOG:( texto_inserido )
		 * A 2 impl. de log, deve mostrar na console: LOG- texto_inserido
		 */
		
		
		// inserir o log na calculadora
		Calculadora cal = new Calculadora();
		cal.setLog(new Log1());
		
		int res = cal.somar(2, 3);
		System.out.println("resultado soma: " + res);
	
		
		
		// inserir o outro log na calculadora
		cal.setLog(new Log2());
		res = cal.somar(5, 4);
		System.out.println("resultado soma: " + res);

	}

}
