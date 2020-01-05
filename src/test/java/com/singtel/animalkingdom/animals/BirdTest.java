package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.Animal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BirdTest {

    private Animal bird;

    @Before
    public void setup(){
        bird = new Bird();
    }

    @Test
    public void testSoundBehaviour(){
        assertFalse("Bird can only Sing",  bird.makeSound());
    }

    @Test
    public void testSingBehaviour(){
        assertTrue("Bird can only Sing",  bird.sing());
    }

    @Test
    public void testFlyBehaviour(){
        assertTrue("Bird can Fly",  bird.fly());
    }

    @Test
    public void testSwimBehaviour(){
        assertFalse("Bird can not Swim",  bird.swim());
    }

    @Test
    public void testWalkBehaviour(){
        assertTrue("Bird can Walk",  bird.walk());
    }

    @Test
    public void testSpecialBehaviour(){
        assertFalse("Bird have no Special Behaviour",  bird.speciality());
    }
}
