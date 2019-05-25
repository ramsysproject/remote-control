package com.emramirez.remotecontrol.command;

import com.emramirez.remotecontrol.receiver.Light;

/**
 * Encapsulating a request as an object
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
