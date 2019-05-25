package com.emramirez.remotecontrol.receiver;

public class GarageDoor {

    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(name + " is up");
    }

    public void down() {
        System.out.println(name + " is down");
    }
}
