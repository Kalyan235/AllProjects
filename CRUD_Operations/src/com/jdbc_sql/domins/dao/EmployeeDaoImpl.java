package com.jdbc_sql.domins.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc_sql.domins.util.ConnectionUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	private static Connection connection = null;

	private Statement statement = null;

	private static String INSERT = "insert into employee values(06,'Ram',79,64000.00)";

	private static String UPDATE = "update employee set name='Degaa',age=56,salary=70000.00 where e_id=6";

	@Override
	public void save() {

		try {
			connection = ConnectionUtil.openConnection();
			statement = connection.createStatement();
			int result = statement.executeUpdate(INSERT);
			System.out.println("Inserted " + result + " row");

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
		// ConnectionUtil.closeConnection(connection, statement);
	}

	@Override
	public void update() {
		connection = ConnectionUtil.openConnection();
		try {
			statement = connection.createStatement();

			int result = statement.executeUpdate(UPDATE);
			System.out.println("Updated " + result + " row");

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

	}

	@Override
	public void getAll() {

		connection = ConnectionUtil.openConnection();

		try {
			statement = connection.createStatement();

			ResultSet rs = statement.executeQuery("Select * from employee");
			while (rs.next())
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getDouble(4));

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

	}

}
