package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.Animal;
import com.singtel.animalkingdom.behaviour.impl.WalkBehaviourImpl;
import com.singtel.animalkingdom.metamorphosis.Metamorphosable;

public class Caterpillar extends Animal implements Metamorphosable<ButterFly> {

    public Caterpillar(){
        walkBehaviour = new WalkBehaviourImpl();
    }

    @Override
    public ButterFly metamorphosis() {
        return new ButterFly(this);
    }
}
