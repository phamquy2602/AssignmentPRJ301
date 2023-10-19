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
public class Instructors {
    private int id;
    private String name;
    private Date dob;
    private boolean gender;
    Class cl;

    public Instructors(int id, String name, Date dob, boolean gender, Class cl) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.cl = cl;
    }

    public Instructors(String name) {
        this.name = name;
    }
    

    public Instructors() {
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

    public Class getCl() {
        return cl;
    }

    public void setCl(Class cl) {
        this.cl = cl;
    }

    @Override
    public String toString() {
        return "Instructors{" + "id=" + id + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", cl=" + cl + '}';
    }
     
}
