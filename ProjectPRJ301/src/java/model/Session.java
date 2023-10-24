/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.assingment;

import java.sql.Date;
import model.IBaseModel;

/**
 *
 * @author sonnt
 */
public class Session implements IBaseModel{
    private int id;
    private Date date;
    private Group group;
    private Instructor instructor;
    private Room room;
    private TimeSlot slot;
    private int index;

    public Session() {
    }

    public Session(Date date, Group group, Instructor instructor, Room room, TimeSlot slot, int index) {
        this.date = date;
        this.group = group;
        this.instructor = instructor;
        this.room = room;
        this.slot = slot;
        this.index = index;
    }

    public Session(int id, Date date, Group group, Instructor instructor, Room room, TimeSlot slot, int index) {
        this.id = id;
        this.date = date;
        this.group = group;
        this.instructor = instructor;
        this.room = room;
        this.slot = slot;
        this.index = index;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public TimeSlot getSlot() {
        return slot;
    }

    public void setSlot(TimeSlot slot) {
        this.slot = slot;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Session{" + "id=" + id + ", date=" + date + ", group=" + group + ", instructor=" + instructor + ", room=" + room + ", slot=" + slot + ", index=" + index + '}';
    }

    
    
}
