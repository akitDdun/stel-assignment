package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.Animal;
import com.singtel.animalkingdom.behaviour.impl.FlyBehaviourImpl;
import com.singtel.animalkingdom.behaviour.impl.SingBehaviourImpl;
import com.singtel.animalkingdom.behaviour.impl.WalkBehaviourImpl;

public class Bird extends Animal {

    public Bird(){
        singBehaviour = new SingBehaviourImpl();
        flyBehaviour = new FlyBehaviourImpl();
        walkBehaviour = new WalkBehaviourImpl();
    }
}