package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.Animal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParrotTest {

    private Animal parrot;
    private String callSound;

    @Before
    public void setup(){
        callSound = "Dog";
        parrot = new Parrot(callSound);
    }

    @Test
    public void testSoundBehaviour(){
        assertTrue("Parrot can make Sound",  parrot.makeSound());
    }

    @Test
    public void testSingBehaviour(){
        assertFalse("Parrot can not Sing",  parrot.sing());
    }

    @Test
    public void testFlyBehaviour(){
        assertTrue("Parrot can Fly",  parrot.fly());
    }

    @Test
    public void testSwimBehaviour(){
        assertFalse("Parrot can not Swim",  parrot.swim());
    }

    @Test
    public void testWalkBehaviour(){
        assertTrue("Parrot can Walk",  parrot.walk());
    }
}
