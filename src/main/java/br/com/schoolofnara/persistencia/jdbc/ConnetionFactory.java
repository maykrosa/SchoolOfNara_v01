package br.com.schoolofnara.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnetionFactory {
	
	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/schoolofnara","postgres","301228mayk");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	

}
