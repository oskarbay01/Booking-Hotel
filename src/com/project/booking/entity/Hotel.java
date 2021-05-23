package com.project.booking.entity;

/* ${@Author} created on 11.05.2021 inside the package - com.project.booking.entity */
public class Hotel {
    private String name;
    private Room[] rooms;

    public Hotel(String name, Room[] rooms) {
        this.name = name;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
