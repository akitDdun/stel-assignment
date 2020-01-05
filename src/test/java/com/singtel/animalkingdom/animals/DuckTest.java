package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.Animal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DuckTest {

    private Animal duck;

    @Before
    public void setup(){
        duck = new Duck();
    }

    @Test
    public void testSoundBehaviour(){
        assertTrue("Duck can make Sound",  duck.makeSound());
    }

    @Test
    public void testSingBehaviour(){
        assertFalse("Duck can not Sing",  duck.sing());
    }

    @Test
    public void testFlyBehaviour(){
        assertTrue("Duck can Fly",  duck.fly());
    }

    @Test
    public void testSwimBehaviour(){
        assertTrue("Duck can Swim",  duck.swim());
    }

    @Test
    public void testWalkBehaviour(){
        assertTrue("Duck can Walk",  duck.walk());
    }
}
