package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.Animal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FishTest {

    private Animal fish;

    @Before
    public void setup(){
        fish = new Fish();
    }

    @Test
    public void testSoundBehaviour(){
        assertFalse("Fish can not make Sound",  fish.makeSound());
    }

    @Test
    public void testSingBehaviour(){
        assertFalse("Fish can not Sing",  fish.sing());
    }

    @Test
    public void testFlyBehaviour(){
        assertFalse("Fish can not Fly",  fish.fly());
    }

    @Test
    public void testSwimBehaviour(){
        assertTrue("Fish can Swim",  fish.swim());
    }

    @Test
    public void testWalkBehaviour(){
        assertFalse("Fish can not Walk",  fish.walk());
    }

    @Test
    public void testSpecialBehaviour(){
        assertFalse("Fish have no Special Behaviour",  fish.speciality());
    }
}
