package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.Animal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ButterFlyTest {

    private Animal butterFly;

    @Before
    public void setup(){
        Caterpillar caterpillar= new Caterpillar();
        butterFly = caterpillar.metamorphosis();
    }

    @Test
    public void testSoundBehaviour(){
        assertFalse("ButterFly cannot make Sound",  butterFly.makeSound());
    }

    @Test
    public void testSingBehaviour(){
        assertFalse("ButterFly can not Sing",  butterFly.sing());
    }

    @Test
    public void testFlyBehaviour(){
        assertTrue("ButterFly can Fly",  butterFly.fly());
    }

    @Test
    public void testSwimBehaviour(){
        assertFalse("ButterFly can not Swim",  butterFly.swim());
    }

    @Test
    public void testWalkBehaviour(){
        assertFalse("ButterFly can not Walk",  butterFly.walk());
    }

    @Test
    public void testSpecialBehaviour(){
        assertFalse("ButterFly have no Special Behaviour",  butterFly.speciality());
    }
}
