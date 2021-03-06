package com.emramirez.remotecontrol.command;

import com.emramirez.remotecontrol.receiver.Light;

/**
 * Encapsulating a request as an object
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
