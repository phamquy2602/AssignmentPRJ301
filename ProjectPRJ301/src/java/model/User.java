/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dal.DBContext;
import java.sql.Date;

/**
 *
 * @author quyde
 */
public class User implements IBaseModel{
    private int id ;
    private String username;
    private String password;
    private String displayname;
    
    

    public User() {
    }

    public User(int id, String username, String password, String displayname) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.displayname = displayname;
    }

    public User(String username, String password, String displayname) {
        this.username = username;
        this.password = password;
        this.displayname = displayname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", password=" + password + ", displayname=" + displayname + '}';
    }

    
    
}

   
    
    

