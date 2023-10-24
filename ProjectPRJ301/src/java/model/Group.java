/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.assingment;

import java.util.ArrayList;
import model.IBaseModel;

/**
 *
 * @author sonnt
 */
public class Group implements IBaseModel{
    private int id;
    private String name;
    private Instructor instructor;
    private ArrayList<Student> students = new ArrayList<>();
    private Subject subject;
    private ArrayList<Session> sessions = new ArrayList<>();

    public Group() {
    }

    public Group(int id, String name, Instructor instructor, Subject subject) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.subject = subject;
    }

    public Group(String name, Instructor instructor, Subject subject) {
        this.name = name;
        this.instructor = instructor;
        this.subject = subject;
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

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

  
    

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public ArrayList<Session> getSessions() {
        return sessions;
    }

    public void setSessions(ArrayList<Session> sessions) {
        this.sessions = sessions;
    }

    @Override
    public String toString() {
        return "Group{" + "id=" + id + ", name=" + name + ", instructor=" + instructor + ", students=" + students + ", subject=" + subject + ", sessions=" + sessions + '}';
    }
    
}
