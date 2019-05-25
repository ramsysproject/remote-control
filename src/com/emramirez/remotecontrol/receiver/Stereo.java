package com.emramirez.remotecontrol.receiver;

public class Stereo {

    private String name;
    private String cd;
    private int volume;

    public Stereo(String name, String cd) {
        this.name = name;
        this.cd = cd;
        volume = 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public void on() {
        System.out.println(name + " stereo is on");
    }

    public void setCD() {
        System.out.println(cd + " is inserted in " + name + " stereo");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(name + " stereo volume is set to " + volume);
    }

    public void off() {
        System.out.println(name + " stereo is off");
    }
}
