package jdbc.service;
import java.sql.SQLException;
import java.sql.Statement;


public interface StudentInf {
	

	public interface StudentInterface {
		void addStudent(Student student) throws SQLException;
		int updateStudent(Student student , int sid,String property) throws SQLException;
		int deleteStudent(int sid) throws SQLException;
		Statement findStudentById(int sid) throws SQLException;
		void displayStudentDetails() throws SQLException;
	}


}
