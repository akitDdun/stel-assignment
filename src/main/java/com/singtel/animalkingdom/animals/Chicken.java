package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.behaviour.impl.SoundBehaviourImpl;

//Assuming Chicken can Walk, but can't swim and fly or sing
public class Chicken extends Bird {
    private static final String CALL_SOUND = "Chicken";

    public Chicken() {
        soundBehaviour = new SoundBehaviourImpl(CALL_SOUND, LOCALE);
        flyBehaviour = null;
        singBehaviour = null;
    }

    public Chicken(String callSound){
        soundBehaviour = new SoundBehaviourImpl(callSound, LOCALE);
        flyBehaviour = null;
        singBehaviour = null;
    }
}
