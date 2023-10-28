/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Attendance;
import model.assingment.Group;
import model.assingment.Room;
import model.assingment.Session;
import model.assingment.Subject;
import model.assingment.TimeSlot;

/**
 *
 * @author quyde
 */
public class SessionDBContext extends DBContext<Session> {

    public ArrayList<Session> getSessions(int iid, Date from, Date to) {
        ArrayList<Session> sessions = new ArrayList<>();
        try {
            String sql = "SELECT  se.id as seid,se.[date],se.[index],r.id as rid,r.RoomName,sub.id as sid,sub.Subname,g.id as gid,g.gname,t.id as timeid,t.[description]\n"
                    + "                                      FROM Session se INNER JOIN [Group] g ON se.Groupid = g.id \n"
                    + "                                      						INNER JOIN [Subject] sub ON g.Subid = sub.id\n"
                    + "                                      						INNER JOIN Room r ON r.id = se.Roomid\n"
                    + "                                       						INNER JOIN TimeSlot t ON se.Timeslotid = t.id\n"
                    + "                                      WHERE se.Insid= ?\n"
                    + "                  \n"
                    + "                   			   AND se.[date] >= ? AND se.[date] <= ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, iid);
            stm.setDate(2, from);
            stm.setDate(3, to);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Session session = new Session();
                session.setId(rs.getInt("seid"));
                session.setDate(rs.getDate("date"));
                session.setIndex(rs.getInt("index"));
                Room r = new Room();
                r.setId(rs.getInt("rid"));
                r.setName(rs.getString("RoomName"));
                session.setRoom(r);

                Group g = new Group();
                g.setId(rs.getInt("gid"));
                g.setName(rs.getString("Gname"));
                session.setGroup(g);

                Subject sub = new Subject();
                sub.setId(rs.getInt("sid"));
                sub.setName(rs.getString("Subname"));
                g.setSubject(sub);

                TimeSlot time = new TimeSlot();
                time.setId(rs.getInt("timeid"));
                time.setDescription(rs.getString("description"));
                session.setSlot(time);

                sessions.add(session);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sessions;
    }

    public Session getSessions(int sesid) {
        try {
            String sql = "SELECT  se.id as seid,se.[date],se.[index],se.isAtt,r.id as rid,r.RoomName,sub.id as sid,sub.Subname,g.id as gid,g.gname,t.id as timeid,t.[description]\n"
                    + "                                      FROM Session se INNER JOIN [Group] g ON se.Groupid = g.id \n"
                    + "                                      						INNER JOIN [Subject] sub ON g.Subid = sub.id\n"
                    + "                                      						INNER JOIN Room r ON r.id = se.Roomid\n"
                    + "                                       						INNER JOIN TimeSlot t ON se.Timeslotid = t.id\n"
                    + "                                      WHERE se.id= ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, sesid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Session session = new Session();
                session.setId(rs.getInt("seid"));
                session.setDate(rs.getDate("date"));
                session.setIndex(rs.getInt("index"));
                session.setIsAtt(rs.getBoolean("isAtt"));
                Room r = new Room();
                r.setId(rs.getInt("rid"));
                r.setName(rs.getString("RoomName"));
                session.setRoom(r);

                Group g = new Group();
                g.setId(rs.getInt("gid"));
                g.setName(rs.getString("Gname"));
                session.setGroup(g);

                Subject sub = new Subject();
                sub.setId(rs.getInt("sid"));
                sub.setName(rs.getString("Subname"));
                g.setSubject(sub);

                TimeSlot time = new TimeSlot();
                time.setId(rs.getInt("timeid"));
                time.setDescription(rs.getString("description"));
                session.setSlot(time);
                return session;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void addAttendences(Session ses) {
        try {
            connection.setAutoCommit(false);
            //Update isAtt
            String sql_update_isAtt = "UPDATE Session SET isAtt = 1 WHERE id = ?";
            PreparedStatement stm_update_isAtt = connection.prepareStatement(sql_update_isAtt);
            stm_update_isAtt.setInt(1, ses.getId());
            stm_update_isAtt.executeUpdate();

            //Remove existing attendences
            String sql_remove_atts = "DELETE Attendance WHERE id = ?";
            PreparedStatement stm_remove_atts = connection.prepareStatement(sql_remove_atts);
            stm_remove_atts.setInt(1, ses.getId());
            stm_remove_atts.executeUpdate();

            //Insert attendences 
            for (Attendance att : ses.getAtts()) {
                String sql_insert_att = "INSERT INTO[Attendance]\n"
                        + "           ([Sessionid]\n"
                        + "           ,[Stuid]\n"
                        + "           ,[status]\n"
                        + "           ,[description]\n"
                        + "           ,[att_datetime])\n"
                        + "     VALUES\n"
                        + "           (?\n"
                        + "           ,?\n"
                        + "           ,?\n"
                        + "           ,?\n"
                        + "           ,getdate())";
                PreparedStatement stm_insert_att = connection.prepareStatement(sql_insert_att);
                stm_insert_att.setInt(1, ses.getId());
                stm_insert_att.setInt(2, att.getStudent().getId());
                stm_insert_att.setBoolean(3, att.isStatus());
                stm_insert_att.setString(4, att.getDescription());
                stm_insert_att.executeUpdate();
            }
            connection.commit();
        } catch (SQLException ex) {
            try {
                connection.rollback();
                Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex1) {
                Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void insert(Session model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Session model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(Session model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Session get(Session model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Session> list() {
        ArrayList<Session> sessions = new ArrayList<>();
        try {
            String sql = "SELECT  *\n"
                    + "                    FROM Session se INNER JOIN [Group] g ON se.Groupid = g.id \n"
                    + "                    						INNER JOIN [Subject] sub ON g.Subid = sub.id\n"
                    + "                    						INNER JOIN Room r ON r.id = se.Roomid\n"
                    + "                    						INNER JOIN TimeSlot t ON se.Timeslotid = t.id";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Session session = new Session();
                session.setId(rs.getInt("id"));
                session.setDate(rs.getDate("date"));
                session.setIndex(rs.getInt("index"));

                Room r = new Room();
                r.setId(rs.getInt("id"));
                r.setName(rs.getString("RoomName"));
                session.setRoom(r);

                Group g = new Group();
                g.setId(rs.getInt("id"));
                g.setName(rs.getString("Gname"));
                session.setGroup(g);

                Subject sub = new Subject();
                sub.setId(rs.getInt("id"));
                sub.setName(rs.getString("Subname"));
                g.setSubject(sub);

                TimeSlot time = new TimeSlot();
                time.setId(rs.getInt("id"));
                time.setDescription(rs.getString("description"));
                session.setSlot(time);

                sessions.add(session);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TimeSlotDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sessions;
    }

    public static void main(String[] args) {
        SessionDBContext dao = new SessionDBContext();
        Session s = dao.getSessions(4);
        System.out.println(s);

    }

}
