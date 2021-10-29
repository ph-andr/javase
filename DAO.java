package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Conex�o com o banco de dados
 * 
 * @author Pedro Henrique Andrade Silva
 * @version 1.0
 */

public class DAO {

	// par�metros de conex�o
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://10.26.45.108:3306/dbgames";
	private String user = "dba";
	private String password = "123@Senac";

	/**
	 * M�todo respons�vel pela conex�o com banco de dados
	 * 
	 * @return con
	 */
	public Connection conectar() {
		// a linha abaixo cria um objeto de nome con
		Connection con = null;
		// tratamento de exce��es
		try {
			// as duas linhas abaixo estabelecem a conex�o
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
