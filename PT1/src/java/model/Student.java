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
public class Student implements IBaseModel{
    private String id;
    private String name;
    private Date dob;
    private boolean gender;
    Classes cl;

    public Student() {
    }

    public Student(String id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    

    public Student(String id, String name, Date dob, boolean gender, Classes cl) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.cl = cl;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Classes getCl() {
        return cl;
    }

    public void setCl(Classes cl) {
        this.cl = cl;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", cl=" + cl + '}';
    }
    
}
