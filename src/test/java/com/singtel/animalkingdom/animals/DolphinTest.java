package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.Animal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DolphinTest {

    private Animal dolphin;

    @Before
    public void setup(){
        dolphin = new Dolphin();
    }

    @Test
    public void testSoundBehaviour(){
        assertFalse("Dolphin can not make Sound",  dolphin.makeSound());
    }

    @Test
    public void testSingBehaviour(){
        assertFalse("Dolphin can not Sing",  dolphin.sing());
    }

    @Test
    public void testFlyBehaviour(){
        assertFalse("Dolphin can not Fly",  dolphin.fly());
    }

    @Test
    public void testSwimBehaviour(){
        assertTrue("Dolphin can Swim",  dolphin.swim());
    }

    @Test
    public void testWalkBehaviour(){
        assertFalse("Dolphin can not Walk",  dolphin.walk());
    }

    @Test
    public void testSpecialBehaviour(){
        assertFalse("Dolphin have no Special Behaviour",  dolphin.speciality());
    }
}
