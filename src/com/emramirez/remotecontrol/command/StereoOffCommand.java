package com.emramirez.remotecontrol.command;

import com.emramirez.remotecontrol.receiver.Stereo;

/**
 * Encapsulating a request as an object
 */
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
