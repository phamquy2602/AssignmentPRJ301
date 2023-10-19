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
public class ClassesDBContext extends DBContext<Classes> {

    
  

    

    @Override
    public void insert(Classes model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Classes model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(Classes model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Classes get(Classes model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Classes> list() {
        ArrayList<Classes> list = new ArrayList<>();
        String sql = "Select Classes.ClassID, Students.StudentID,Students.StudentName,Students.BirthDate,Classes.ClassName,Classes.StartDate,Instructors.InstructorName from Classes \n" +
"               inner join Students on Students.ClassID = Classes.ClassID \n" +
"               inner join Instructors on Instructors.ClassID = Classes.ClassID ORDER BY Students.StudentID ASC";
        try {
            PreparedStatement statement = connection.prepareCall(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Student student = new Student(rs.getString("StudentID"), rs.getString("StudentName"), rs.getDate("BirthDate"));
                Instructors instructors = new Instructors(rs.getString("InstructorName"));
                Classes cl = new Classes(rs.getInt("ClassID"), rs.getString("ClassName"), rs.getDate("StartDate"), student, instructors);
                list.add(cl);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
public static void main(String[] args) {
        ClassesDBContext dao = new ClassesDBContext();
        ArrayList<Classes> list = dao.list();
        System.out.println(list);

    
    
   }
}