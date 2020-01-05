package com.singtel.animalkingdom.animals;

import com.singtel.animalkingdom.Animal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ChickenTest {

    private Animal chicken;
    private Animal rooster;

    @Before
    public void setup(){
        chicken = new Chicken();
        rooster = new Chicken("Rooster");
    }

    @Test
    public void testChickenSoundBehaviour(){
        assertTrue("Chicken can make Sound",  chicken.makeSound());
    }

    @Test
    public void testChickenSingBehaviour(){
        assertFalse("Chicken can not Sing",  chicken.sing());
    }

    @Test
    public void testChickenFlyBehaviour(){
        assertFalse("Chicken can not Fly",  chicken.fly());
    }

    @Test
    public void testChickenSwimBehaviour(){
        assertFalse("Chicken can not Swim",  chicken.swim());
    }

    @Test
    public void testChickenWalkBehaviour(){
        assertTrue("Chicken can Walk",  chicken.walk());
    }

    @Test
    public void testChickenSpecialBehaviour(){
        assertFalse("Chicken have no Special Behaviour",  chicken.speciality());
    }

    @Test
    public void testRoosterSoundBehaviour(){
        assertTrue("Rooster can make Sound",  rooster.makeSound());
    }

    @Test
    public void testRoosterSingBehaviour(){
        assertFalse("Rooster can not Sing",  rooster.sing());
    }

    @Test
    public void testRoosterFlyBehaviour(){
        assertFalse("Rooster can not Fly",  rooster.fly());
    }

    @Test
    public void testRoosterSwimBehaviour(){
        assertFalse("Rooster can not Swim",  rooster.swim());
    }

    @Test
    public void testRoosterWalkBehaviour(){
        assertTrue("Rooster can Walk",  rooster.walk());
    }

    @Test
    public void testRoosterSpecialBehaviour(){
        assertFalse("Rooster have no Special Behaviour",  rooster.speciality());
    }
}
