package org.train.command.model.receiver;

public class Musik {

    public void onStereo(){
        System.out.println("Stereo is on");
    }

    public void setArtist(String artist){
        System.out.println("Artist - " + artist + " was set and playing");
    }

    public void setVolume(int level){
        System.out.println("Volume set to " + level);
    }

    public void offStereo(){
        System.out.println("Stereo is off");
    }
}
