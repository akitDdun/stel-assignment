package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.Animal;
import com.singtel.animalkingdom.behaviour.impl.SwimBehaviourImpl;

public class Fish extends Animal {

    public Fish(){
        swimBehaviour = new SwimBehaviourImpl();
    }
}
