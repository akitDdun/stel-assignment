package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.behaviour.impl.FlyBehaviourImpl;
import com.singtel.animalkingdom.behaviour.impl.SoundBehaviourImpl;
import com.singtel.animalkingdom.behaviour.impl.WalkBehaviourImpl;

public class Parrot extends Bird {

    public Parrot(String callSound){
        singBehaviour = null;
        flyBehaviour = new FlyBehaviourImpl();
        walkBehaviour = new WalkBehaviourImpl();
        soundBehaviour = new SoundBehaviourImpl(callSound);
    }
}
