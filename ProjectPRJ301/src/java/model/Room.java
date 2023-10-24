/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.assingment;

import model.IBaseModel;

/**
 *
 * @author sonnt
 */
public class Room implements IBaseModel{
    private int id;
    private String name;

    public Room() {
    }

    public Room(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Room(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Room{" + "id=" + id + ", name=" + name + '}';
    }
    
    
}
