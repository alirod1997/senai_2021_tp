package adapterApplication;

public class OracleCommands implements BDadapter {

	@Override
	public void insert() {
		System.out.println("Insert feito no oracle");
	}

	@Override
	public void update() {
		System.out.println("Update feito no oracle");

	}

	@Override
	public void delete() {
		System.out.println("Delete feito no oracle");


	}

}
