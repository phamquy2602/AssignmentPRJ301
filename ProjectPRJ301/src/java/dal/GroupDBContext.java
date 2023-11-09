/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import dal.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.assingment.Group;
import model.assingment.Instructor;
import model.assingment.Subject;

/**
 *
 * @author quyde
 */
public class GroupDBContext extends DBContext<Group> {

    @Override
    public void insert(Group model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Group model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(Group model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Group get(Group model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Group> list() {
        ArrayList<Group> groups = new ArrayList<>();
        try {
            String sql = "select g.id as groupid , g.Gname, g.Insid,g.Subid ,i.ifullname as InstructorName, s.Subname from [Group] g \n"
                    + "inner join Instructor i on i.id = g.Insid\n"
                    + "inner join Subject s on s.id = g.Subid";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Group group = new Group();
                group.setId(rs.getInt("groupid"));
                group.setName(rs.getString("GName"));

                Instructor instructor = new Instructor();
                instructor.setId(rs.getInt("Insid"));
                instructor.setName(rs.getString("InstructorName"));
                group.setInstructor(instructor);

                Subject subject = new Subject();
                subject.setId(rs.getInt("Subid"));
                subject.setName(rs.getString("Subname"));
                group.setSubject(subject);

                groups.add(group);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GroupDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return groups;
    }

    public ArrayList<Group> listAllGroup(String insId) {
        ArrayList<Group> groups = new ArrayList<>();
        try {
            String sql = "select * from [Group] where Insid = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, insId);  // Truyền giá trị id vào câu truy vấn
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Group group = new Group();
                group.setId(rs.getInt("id"));
                group.setName(rs.getString("Gname"));
                groups.add(group);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GroupDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return groups;
    }
    
    public static void main(String[] args) {
        GroupDBContext dao = new GroupDBContext();
        ArrayList<Group> list = dao.listAllGroup("2");
        System.out.println(list);

    }

    public void delete(String id) {
        try {
            String sql = "delete from [Group] where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            statement.executeUpdate();

            System.out.println("Deleted user - id: " + id);
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addGroup(String GName, String Subid, String Insid) {

        String sql = "INSERT INTO [dbo].[Group]\n"
                + "           ([Gname]\n"
                + "           ,[Subid]\n"
                + "           ,[Insid])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?)";

        try {

            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, GName);
            statement.setString(2, Subid);
            statement.setString(3, Insid);

            statement.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void EditGroup(String name, String sid, String insid, String id) {
        String sql = "UPDATE [dbo].[Group]\n"
                + "   SET [Gname] = ?\n"
                + "      ,[Subid] = ?\n"
                + "      ,[Insid] = ?\n"
                + " WHERE id=?";

        try {
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, name);
            statement.setString(2, sid);
            statement.setString(3, insid);

            statement.setString(4, id);

            statement.executeUpdate();
        } catch (Exception e) {
        }

    }

    public Group get(String gid) {
        String sql = "Select g.id as groupid , g.Gname, g.Insid,g.Subid ,i.ifullname as InstructorName, s.Subname from [Group] g \n"
                + "                    inner join Instructor i on i.id = g.Insid\n"
                + "                    inner join Subject s on s.id = g.Subid\n"
                + "					where g.id = ?";
        try {
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, gid);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Group group = new Group();
                group.setId(rs.getInt("groupid"));
                group.setName(rs.getString("GName"));

                Instructor instructor = new Instructor();
                instructor.setId(rs.getInt("Insid"));
                instructor.setName(rs.getString("InstructorName"));
                group.setInstructor(instructor);

                Subject subject = new Subject();
                subject.setId(rs.getInt("Subid"));
                subject.setName(rs.getString("Subname"));
                group.setSubject(subject);

                return group;
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }

    
}
