package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.Animal;
import com.singtel.animalkingdom.behaviour.impl.SwimBehaviourImpl;

public class Dolphin extends Animal {

    public Dolphin(){
        swimBehaviour = new SwimBehaviourImpl();
    }
}
