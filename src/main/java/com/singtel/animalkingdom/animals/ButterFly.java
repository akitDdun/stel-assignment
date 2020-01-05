package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.Animal;
import com.singtel.animalkingdom.behaviour.impl.FlyBehaviourImpl;

public class ButterFly extends Animal {

    public ButterFly(Caterpillar caterpillar){
        flyBehaviour = new FlyBehaviourImpl();
    }
}
