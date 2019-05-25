package com.emramirez.remotecontrol.receiver;

public class CeilingFan {

    private String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " ceiling fan is on");
    }

    public void off() {
        System.out.println(name + " ceiling fan is off");
    }
}
