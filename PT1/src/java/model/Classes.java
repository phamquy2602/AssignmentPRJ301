/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author quyde
 */
public class Classes implements IBaseModel{
    private int id ;
    private String name;
    private Date date;
    Student student;
    Instructors instructors;

    public Classes() {
    }

    public Classes(String name, Date date) {
        this.name = name;
        this.date = date;
    }
    

    public Classes(int id, String name, Date date, Student student, Instructors instructors) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.student = student;
        this.instructors = instructors;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    @Override
    public String toString() {
        return "Classes{" + "id=" + id + ", name=" + name + ", date=" + date + ", student=" + student + ", instructors=" + instructors + '}';
    }
    
}
