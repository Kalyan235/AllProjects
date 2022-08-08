package com.jdbc_sql.domins.Test;

import com.jdbc_sql.domins.dao.EmployeeDaoImpl;

public class EmployeeTest {

	public static void main(String[] args) {

		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();

		employeeDaoImpl.save();
		employeeDaoImpl.update();
		employeeDaoImpl.getAll();
	}

}
