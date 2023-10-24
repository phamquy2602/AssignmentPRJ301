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
public class TimeSlot implements IBaseModel{
    private int id;
    private String description;

    public TimeSlot() {
    }

    public TimeSlot(String description) {
        this.description = description;
    }

    public TimeSlot(int id, String description) {
        this.id = id;
        this.description = description;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TimeSlot{" + "id=" + id + ", description=" + description + '}';
    }
    
}
