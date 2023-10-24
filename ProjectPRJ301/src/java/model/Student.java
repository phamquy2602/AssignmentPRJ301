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
public class Student implements IBaseModel{
    private int id;
    private String name;
    private ArrayList<Group> groups = new ArrayList<>();
    User user ;

    public Student() {
    }

    public Student(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public Student(int id, String name, User user) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", groups=" + groups + ", user=" + user + '}';
    }
    
}
