package com.singtel.animalkingdom;

import com.singtel.animalkingdom.behaviour.*;

public abstract class Animal {

    protected SingBehaviour singBehaviour;
    protected FlyBehaviour flyBehaviour;
    protected WalkBehaviour walkBehaviour;

    public boolean fly(){
        if(flyBehaviour != null){
            flyBehaviour.fly();
            return true;
        }
        return false;
    }

    public boolean sing(){
        if(singBehaviour != null){
            singBehaviour.sing();
            return true;
        }
        return false;
    }

    public boolean walk(){
        if(walkBehaviour != null){
            walkBehaviour.walk();
            return true;
        }
        return false;
    }
}
