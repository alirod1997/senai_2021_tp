package adapterApplication;

public class MysqlAdapter implements BDadapter {
	//atributo do tipo MysqlCommands
	private MysqlCommands mysql;
	
	
	//construtor que recebe um tipo MysqlCommands e faz a adaptação
	public MysqlAdapter(MysqlCommands mysql) {
		this.mysql = mysql;
	}

	//comandos adaptados para o comando do adaptador
	@Override
	public void insert() {
		this.mysql.insertMysql();
	}

	@Override
	public void update() {
		this.mysql.updateMysql();
	}

	@Override
	public void delete() {
		this.mysql.deleteMysql();

	}

}
