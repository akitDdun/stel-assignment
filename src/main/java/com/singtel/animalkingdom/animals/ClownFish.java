package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.behaviour.impl.ClownFishSpecialBehaviour;

public class ClownFish extends Fish {
    public ClownFish(){
        specialBehaviour = new ClownFishSpecialBehaviour();
    }
}
