package aula6;

public class Aula6_Main {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro();
		Baleia baleia = new Baleia();
		
		dog.caminhar();
		dog.comer();
		
		baleia.nadar();
		baleia.comer();
		
		System.out.println("--------------------------------------");
		Bixo bixo = dog;
		bixo.comer();
		
	}
}