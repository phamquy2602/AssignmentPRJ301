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
public class Employee implements IBaseModel{
    private int id;
    private String name;
    private boolean gender;
    private Date dob;
    Department department;
    User user;

    public Employee() {
    }

    public Employee(int id, String name, boolean gender, Date dob, Department department, User user) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.department = department;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", department=" + department + ", user=" + user + '}';
    }
    
    
    
}
