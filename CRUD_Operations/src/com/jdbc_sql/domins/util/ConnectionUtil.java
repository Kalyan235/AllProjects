package com.jdbc_sql.domins.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {

	private static Connection connection = null;

	static {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/collage", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static Connection openConnection() {
		return connection;
	}

	public static void closeConnection(Connection connection) {

		if (connection != null) {

			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}
	}

	public static void closeConnection(Connection connection, Statement statement) {

		if (statement != null) {

			try {
				connection.close();
				statement.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

}
