/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Attendance;
import model.assingment.Instructor;
import model.assingment.Session;
import model.assingment.Student;

/**
 *
 * @author quyde
 */
public class AttendanceDBContext extends DBContext<Attendance> {

    public ArrayList<Attendance> getAttendancesBySession(int sesid) {
        ArrayList<Attendance> atts = new ArrayList<>();
        try {
            String sql = "SELECT s.id as stuid,s.fullname as stuname,\n"
                    + "                     ISNULL(a.status,0) as [status]\n"
                    + "                      ,ISNULL(a.description,'') as [description],\n"
                    + "                       ISNULL(a.att_datetime,GETDATE()) as att_datetime\n"
                    + "                      FROM [Session] ses INNER JOIN [Group] g ON g.id = ses.Groupid\n"
                    + "                    								INNER JOIN Group_Student gs ON g.id = gs.Groupid\n"
                    + "                    								INNER JOIN Student s ON s.id = gs.Stuid\n"
                    + "                    								LEFT JOIN Attendance a ON a.Sessionid = ses.id AND s.id = a.Stuid\n"
                    + "where ses.id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, sesid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Attendance att = new Attendance();
                Student s = new Student();
                Session ses = new Session();
                s.setId(rs.getInt("stuid"));
                s.setName(rs.getString("stuname"));
                att.setStudent(s);
                ses.setId(sesid);
                att.setSession(ses);
                att.setStatus(rs.getBoolean("status"));
                att.setDescription(rs.getString("description"));
                att.setDatetime(rs.getTimestamp("att_datetime"));
                atts.add(att);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AttendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return atts;
    }

    public ArrayList<Attendance> getAttendancesByGroupIdandInstructorId(String groupid, String insid) {
        ArrayList<Attendance> atts = new ArrayList<>();
        try {
            String sql = "select ss.Insid, a.Sessionid ,s.id as StudentID,a.status,s.fullname from Attendance a  right join Student s on s.id = a.Stuid  \n"
                    + "  inner join [Session] ss on ss.id = a.Sessionid\n"
                    + "																			 \n"
                    + "	where ss.Groupid = ? and ss.Insid =?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, groupid);
            stm.setString(2, insid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Attendance att = new Attendance();
                att.setStatus(rs.getBoolean("status"));

                Session session = new Session();
                session.setId(rs.getInt("Sessionid"));
                att.setSession(session);

                Instructor instructor = new Instructor();
                instructor.setId(rs.getInt("Insid"));
                session.setInstructor(instructor);

                Student student = new Student();
                student.setId(rs.getInt("StudentID"));
                student.setName(rs.getString("fullname"));
                att.setStudent(student);

                atts.add(att);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AttendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return atts;
    }

    public ArrayList<Attendance> listAllAttendance() {
        ArrayList<Attendance> attendances = new ArrayList<>();
        try {
            String sql = "select a.Sessionid ,s.id as StudentID,a.status,s.fullname from Attendance a  right  join Student s on s.id = a.Stuid  ";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                Attendance att = new Attendance();
                att.setStatus(rs.getBoolean("status"));

                Session session = new Session();
                session.setId(rs.getInt("Sessionid"));
                att.setSession(session);

                Student student = new Student();
                student.setId(rs.getInt("StudentID"));
                student.setName(rs.getString("fullname"));
                att.setStudent(student);

                attendances.add(att);

            }
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return attendances;
    }

    public ArrayList<Attendance> getAttendancesByGroupId(String groupid) {
        ArrayList<Attendance> atts = new ArrayList<>();
        try {
            String sql = "select  a.Sessionid ,s.id as StudentID,a.status,s.fullname from Attendance a  right join Student s on s.id = a.Stuid  \n"
                    + "                                                                             inner join [Session] ss on ss.id = a.Sessionid\n"
                    + "																			 \n"
                    + "																			 where   ss.Groupid =?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, groupid);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Attendance att = new Attendance();
                att.setStatus(rs.getBoolean("status"));

                Session session = new Session();
                session.setId(rs.getInt("Sessionid"));
                att.setSession(session);

                Student student = new Student();
                student.setId(rs.getInt("StudentID"));
                student.setName(rs.getString("fullname"));
                att.setStudent(student);

                atts.add(att);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AttendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return atts;
    }

    public static void main(String[] args) {
        AttendanceDBContext dao = new AttendanceDBContext();
        ArrayList<Attendance> list = dao.getAttendancesByGroupId("1");
        System.out.println(list);

    }

    @Override
    public void insert(Attendance model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Attendance model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(Attendance model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Attendance get(Attendance model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Attendance> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
