package com.jdbc_sql.domins.Test;

import com.jdbc_sql.domins.dao.StudentDaoImpl;

public class StudentTest {

	public static void main(String[] args) {

		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();

		studentDaoImpl.insert();
		studentDaoImpl.update();
		studentDaoImpl.getAll();

	}
}
