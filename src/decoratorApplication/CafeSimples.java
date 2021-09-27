package decoratorApplication;


public class CafeSimples implements Cafe{

	@Override
	public double informarPreco() {
		return 1;
	}

	@Override
	public String informarIngredientes() {
		return "Cafe";
	}
	

}
