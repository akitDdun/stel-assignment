package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.Animal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ClownFishTest {

    private Animal clownFish;

    @Before
    public void setup(){
        clownFish = new ClownFish();
    }

    @Test
    public void testSoundBehaviour(){
        assertFalse("ClownFish can not make Sound",  clownFish.makeSound());
    }

    @Test
    public void testSingBehaviour(){
        assertFalse("ClownFish can not Sing",  clownFish.sing());
    }

    @Test
    public void testFlyBehaviour(){
        assertFalse("ClownFish can not Fly",  clownFish.fly());
    }

    @Test
    public void testSwimBehaviour(){
        assertTrue("ClownFish can Swim",  clownFish.swim());
    }

    @Test
    public void testWalkBehaviour(){
        assertFalse("ClownFish can not Walk",  clownFish.walk());
    }

    @Test
    public void testSpecialBehaviour(){
        assertTrue("ClownFish have Special Behaviour",  clownFish.speciality());
    }
}
