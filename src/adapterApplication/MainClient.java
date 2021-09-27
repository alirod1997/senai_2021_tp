package adapterApplication;

public class MainClient {

	public static void main(String[] args) {
		//instancia do banco que não precisou de adaptação
		OracleCommands oracle = new OracleCommands();
		oracle.insert();
		
		//usando a camada de compatibilidade na client/Main
		MysqlAdapter mysql = new MysqlAdapter(new MysqlCommands());
		mysql.insert();
	
	
	
	}

}
