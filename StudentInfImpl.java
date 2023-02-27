package jdbc.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbcpack.CustomConnection;
import jdbcpack.model.Student;

public class StudentInfImpl implements StudentInfs{

		Connection connection=null;
		PreparedStatement pstatement=null;
		public StudentInfImpl()
		{
			connection=CustomConnection.getCustConnection();
		}
		@Override
		public void addStudent(Student student) throws SQLException {
			// TODO Auto-generated method stub
			
			pstatement=connection.prepareStatement("insert into Student values(?,?,?)");
			pstatement.setInt(1, student.getSid());
			pstatement.setString(2, student.getName());
			pstatement.setFloat(3,student.getMarks());
			int res=pstatement.executeUpdate();
			if(res==1)
			{
				System.out.println("inserted successfully");
			}
		}

		@Override
		public int updateStudent(Student student, int sid,String property) throws SQLException {
			// TODO Auto-generated method stub
			Student student1=findStudentById(sid);
		if(property.equals("name"))
			student1.setName(student.getName());
		if(property.equals("marks"))
			student1.setMarks(student.getMarks());
		
			pstatement=connection.prepareStatement("update student set sname=?,marks=? where sid=? ");
			pstatement.setString(1,student1.getName());
			pstatement.setFloat(2, student1.getMarks());
			pstatement.setInt(3, sid);
			int r=pstatement.executeUpdate();
			return r;
		}

		@Override
		public int deleteStudent(int sid) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Student findStudentById(int sid) throws SQLException {
			// TODO Auto-generated method stub
			pstatement=connection.prepareStatement("select *from student where sid=?");
			pstatement.setInt(1,sid);
			ResultSet rs=pstatement.executeQuery();
			rs.next();
			Student student=new Student(rs.getInt(1),rs.getString(2),rs.getFloat(3));
			return student;
		}

		@Override
		public void displayStudentDetails() throws SQLException {
			// TODO Auto-generated method stub
			pstatement=connection.prepareStatement("select *from student");
			ResultSet resultSet = pstatement.executeQuery();
		while(resultSet.next())//next() --brings the cursor to the first record
			//returns true
		{
		int sid=resultSet.getInt("sid");
		String name=resultSet.getString("sname");
		float marks=resultSet.getFloat("marks");
		Student student = new Student(sid,name,marks);
		System.out.println(student);
		}
		}

}
