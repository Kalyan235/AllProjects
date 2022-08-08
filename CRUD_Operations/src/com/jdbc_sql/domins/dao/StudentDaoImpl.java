package com.jdbc_sql.domins.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc_sql.domins.util.ConnectionUtil;

public class StudentDaoImpl implements StudentDao {

	private static Connection connection = null;

	private Statement statement = null;

	private static String INSERT = " insert into student values(105,'Blake',25000,'Maadhapoor','gdk')";

	private static String UPDATE = "update student set name='Maahaan' where Sid=105";

	@Override
	public void insert() {
		connection = ConnectionUtil.openConnection();

		try {
			statement = connection.createStatement();

			int result = statement.executeUpdate(INSERT);

			System.out.println("Inserted " + result + " row");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void update() {

		connection = ConnectionUtil.openConnection();
		try {
			statement = connection.createStatement();
			int result = statement.executeUpdate(UPDATE);

			System.out.println("Update " + result + " row");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void getAll() {

		connection = ConnectionUtil.openConnection();

		try {
			statement = connection.createStatement();

			ResultSet rs = statement.executeQuery("select * from student");

			while (rs.next()) {

				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3) + " " + rs.getString(4)+ " " + rs.getString(5));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
