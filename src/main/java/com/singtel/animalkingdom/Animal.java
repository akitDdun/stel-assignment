package com.singtel.animalkingdom;

import com.singtel.animalkingdom.behaviour.*;

public abstract class Animal {

    protected SoundBehaviour soundBehaviour;
    protected SingBehaviour singBehaviour;
    protected FlyBehaviour flyBehaviour;
    protected SwimBehaviour swimBehaviour;
    protected WalkBehaviour walkBehaviour;

    public boolean fly(){
        if(flyBehaviour != null){
            flyBehaviour.fly();
            return true;
        }
        return false;
    }

    public boolean makeSound(){
        if(soundBehaviour != null){
            soundBehaviour.makeSound();
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

    public boolean swim(){
        if(swimBehaviour != null){
            swimBehaviour.swim();
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
