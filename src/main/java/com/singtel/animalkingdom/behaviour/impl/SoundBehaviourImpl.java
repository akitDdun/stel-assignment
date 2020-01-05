package com.singtel.animalkingdom.behaviour.impl;

import com.singtel.animalkingdom.behaviour.SoundBehaviour;
import com.singtel.animalkingdom.behaviour.sounds.SoundsLibrary;

public class SoundBehaviourImpl implements SoundBehaviour {

    private String callSound;
    private String locale;

    public SoundBehaviourImpl(String callSound, String locale){
        this.callSound = callSound;
        this.locale = locale;
    }

    @Override
    public void makeSound(){
        if((callSound != null && !callSound.isEmpty()) && (locale != null && !locale.isEmpty())) {
            SoundsLibrary soundsLibrary = SoundsLibrary.valueOf(locale+"_"+callSound);
            System.out.println(soundsLibrary.sound());
        } else{
            System.out.println("Silent Animal");
        }
    }
}
