package exercicios_E1_Aula13;

public class MainEx1 {

	public static void main(String[] args) {

		Ex1_thread_imprime_numeros thread1 = new Ex1_thread_imprime_numeros("contador A");
		thread1.start();

//		exercicio2: Em cima da thread acima, instância e execute 2 dessas thread. Verifique o resultado.		
		Ex1_thread_imprime_numeros thread2 = new Ex1_thread_imprime_numeros("contador B");
		thread2.start();
		
		Ex1_thread_imprime_numeros thread3 = new Ex1_thread_imprime_numeros("contador C");
		thread3.start();
	}

}
