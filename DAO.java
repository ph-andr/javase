package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Conexão com o banco de dados
 * 
 * @author Pedro Henrique Andrade Silva
 * @version 1.0
 */

public class DAO {

	// parâmetros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://10.26.45.108:3306/dbgames";
	private String user = "dba";
	private String password = "123@Senac";

	/**
	 * Método responsável pela conexão com banco de dados
	 * 
	 * @return con
	 */
	public Connection conectar() {
		// a linha abaixo cria um objeto de nome con
		Connection con = null;
		// tratamento de exceções
		try {
			// as duas linhas abaixo estabelecem a conexão
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
