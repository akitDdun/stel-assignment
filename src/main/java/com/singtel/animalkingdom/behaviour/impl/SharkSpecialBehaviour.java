package com.singtel.animalkingdom.behaviour.impl;

import com.singtel.animalkingdom.behaviour.SpecialBehaviour;

public class SharkSpecialBehaviour implements SpecialBehaviour {

    @Override
    public void speciality() {
        System.out.println("Sharks are large and grey");
        System.out.println("Sharks eat other fish");
    }
}
