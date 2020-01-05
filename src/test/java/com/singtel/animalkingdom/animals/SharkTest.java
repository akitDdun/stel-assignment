package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.Animal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SharkTest {

    private Animal shark;

    @Before
    public void setup(){
        shark = new Shark();
    }

    @Test
    public void testSoundBehaviour(){
        assertFalse("Shark can not make Sound",  shark.makeSound());
    }

    @Test
    public void testSingBehaviour(){
        assertFalse("Shark can not Sing",  shark.sing());
    }

    @Test
    public void testFlyBehaviour(){
        assertFalse("Shark can not Fly",  shark.fly());
    }

    @Test
    public void testSwimBehaviour(){
        assertTrue("Shark can Swim",  shark.swim());
    }

    @Test
    public void testWalkBehaviour(){
        assertFalse("Shark can not Walk",  shark.walk());
    }

    @Test
    public void testSpecialBehaviour(){
        assertTrue("Shark have Special Behaviour",  shark.speciality());
    }
}
