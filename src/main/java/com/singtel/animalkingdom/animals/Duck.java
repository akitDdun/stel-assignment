package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.behaviour.impl.SoundBehaviourImpl;
import com.singtel.animalkingdom.behaviour.impl.SwimBehaviourImpl;

//Assuming a duck can walk, fly and Swim but cannot Sing
public class Duck extends Bird {
    private static final String CALL_SOUND = "Duck";

    public Duck() {
        swimBehaviour = new SwimBehaviourImpl();
        soundBehaviour = new SoundBehaviourImpl(CALL_SOUND);
        singBehaviour = null;
    }
}
