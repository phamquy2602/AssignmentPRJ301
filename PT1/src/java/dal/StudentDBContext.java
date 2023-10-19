/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Classes;
import model.Instructors;
import model.Student;

/**
 *
 * @author quyde
 */
public class StudentDBContext extends DBContext<Student>{

    @Override
    public void insert(Student model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Student model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(Student model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Student get(Student model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Student> list() {
       ArrayList<Student> list = new ArrayList<>();
        String sql = "Select Students.StudentID,Students.StudentName,Students.BirthDate,Classes.ClassName,Classes.StartDate from Classes \n" +
"                inner join Students on Students.ClassID = Classes.ClassID";
                
        try {
            PreparedStatement statement = connection.prepareCall(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Classes cl = new Classes(rs.getString("ClassName"), rs.getDate("StartDate"));
//                Student students = new Student(rs.getInt("StudentID"), rs.getString("StudentName"),rs.getDate("BirthDate"),rs.getBoolean("Gender"), cl);
                
                
//                list.add(students);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void main(String[] args) {
        StudentDBContext dao = new StudentDBContext();
        ArrayList<Student> list = dao.list();
        System.out.println(list);
    
}
}