/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import model.Employee;

/**
 *
 * @author quyde
 */
public class EmployeeDBContext extends DBContext<Employee> {

    @Override
    public void insert(Employee model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Employee model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(Employee model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Employee get(Employee model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Employee> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addEmployee(String name, String gender, String dob, String createdby, String deptid) {

        String sql = "INSERT INTO [Employee]\n"
                + "           ([ename]\n"
                + "           ,[gender]\n"
                + "           ,[dob]\n"
                + "           ,[createdby]\n"
                + "           ,[departmentid])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";

        try {

            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, name);
            statement.setString(2, gender);
            statement.setString(3, dob);
            statement.setString(4, createdby);
            statement.setString(5, deptid);

            statement.executeUpdate();
        } catch (Exception e) {
        }

    }
     public static void main(String[] args) {
        EmployeeDBContext dao = new EmployeeDBContext();
         dao.addEmployee("quang anh", "1", "2023-01-01", "phamquy", "1");
        

    
    
   }
}
