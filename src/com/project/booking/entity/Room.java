package com.project.booking.entity;

/* ${@Author} created on 11.05.2021 inside the package - com.project.booking.entity */
public class Room {
    private int countOfPerson;
    private int cost;
    private boolean free;

    public Room(int countOfPerson, int cost, boolean free) {
        this.countOfPerson = countOfPerson;
        this.cost = cost;
        this.free = free;
    }

    public int getCountOfPerson() {
        return countOfPerson;
    }

    public void setCountOfPerson(int countOfPerson) {
        this.countOfPerson = countOfPerson;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
