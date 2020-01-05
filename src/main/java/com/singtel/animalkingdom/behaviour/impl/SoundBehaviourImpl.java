package com.singtel.animalkingdom.behaviour.impl;

import com.singtel.animalkingdom.behaviour.SoundBehaviour;
import com.singtel.animalkingdom.behaviour.sounds.SoundsLibrary;

public class SoundBehaviourImpl implements SoundBehaviour {

    private String callSound;

    public SoundBehaviourImpl(String callSound){
        this.callSound = callSound;
    }

    @Override
    public void makeSound(){
        if(callSound != null && !callSound.isEmpty()) {
            SoundsLibrary soundsLibrary = SoundsLibrary.valueOf(callSound);
            System.out.println(soundsLibrary.sound());
        } else{
            System.out.println("Silent Animal");
        }
    }
}
