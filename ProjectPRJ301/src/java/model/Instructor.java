/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.assingment;

import java.util.ArrayList;
import model.IBaseModel;
import model.User;

/**
 *
 * @author sonnt
 */
public class Instructor implements IBaseModel{
    private int id;
    private String name;
    private ArrayList<Group> groups = new ArrayList<>();
    private ArrayList<Session> sessions = new ArrayList<>();
    private User user;

    public Instructor() {
    }
    
    
    
    
    
    public Instructor(String name, User user) {
        this.name = name;
        this.user = user;
    }
    
    
    public Instructor(int id, String name, User user) {
        this.id = id;
        this.name = name;
        this.user = user;
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public ArrayList<Session> getSessions() {
        return sessions;
    }

    public void setSessions(ArrayList<Session> sessions) {
        this.sessions = sessions;
    }

    @Override
    public String toString() {
        return "Instructor{" + "id=" + id + ", name=" + name + ", groups=" + groups + ", sessions=" + sessions + ", user=" + user + '}';
    }
    
}
