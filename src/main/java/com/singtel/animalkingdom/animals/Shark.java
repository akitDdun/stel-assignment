package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.behaviour.impl.SharkSpecialBehaviour;

public class Shark extends Fish {

    public Shark(){
        specialBehaviour = new SharkSpecialBehaviour();
    }
}
