package com.edubridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRowsIntable {
	public static Statement mySqlStatement() throws SQLException, ClassNotFoundException {
		Connection connection=null;
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/edubridge", "root", "Mounika21#");
		Statement statement = connection.createStatement();
		return statement;
	}
	public static int DeleteValues() throws ClassNotFoundException, SQLException {
		Statement statement =mySqlStatement();
		String str="delete from student where stdId=200";
				//+"(100,'mounika',89.87,'9999999999')";
		int count = statement.executeUpdate(str);
		return count;
	}

	public static void main(String[] args)  {
		try {
			int count = DeleteValues();
			System.out.println(count);
		}catch(ClassNotFoundException ex) {
			System.out.println(ex.getMessage()+"   "+ex.getClass());
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}  
	}
}
