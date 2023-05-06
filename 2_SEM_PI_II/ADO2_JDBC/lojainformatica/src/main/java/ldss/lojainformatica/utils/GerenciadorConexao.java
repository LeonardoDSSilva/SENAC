package ldss.lojainformatica.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciadorConexao {

	private static String driver = "com.mysql.cj.jdbc.Driver";

	private static String url = "jdbc:mysql://localhost:3306/lojainformatica?useTimezone=true&serverTimezone=UTC";
	private static String usuario = "root";
	private static String senha = "m60a36";

	public static Connection conexao = null;

	public static Connection abrirConexao() {

		if (conexao == null) {
			try {
				Class.forName(driver);
				conexao = DriverManager.getConnection(url, usuario, senha);
			} catch (ClassNotFoundException e) {
				System.out.println("Driver não encontrado: " + e.getMessage());
			} catch (SQLException e) {
				System.out.println("Erro ao conectar: " + e.getMessage());
			}
		}
		return conexao;
	}
}
