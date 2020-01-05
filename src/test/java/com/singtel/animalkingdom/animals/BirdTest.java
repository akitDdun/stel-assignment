package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.Animal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BirdTest {

    private Animal bird;

    @Before
    public void setup(){
        bird = new Bird();
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
    public void testWalkBehaviour(){
        assertTrue("Bird can Walk",  bird.walk());
    }
}
