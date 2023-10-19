/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author quyde
 */
public class User implements IBaseModel{
    private String username;
    private String password;
    private String diplayname;

    public User() {
    }

    public User(String username, String password, String diplayname) {
        this.username = username;
        this.password = password;
        this.diplayname = diplayname;
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

    public String getDiplayname() {
        return diplayname;
    }

    public void setDiplayname(String diplayname) {
        this.diplayname = diplayname;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", diplayname=" + diplayname + '}';
    }
    
    
}
