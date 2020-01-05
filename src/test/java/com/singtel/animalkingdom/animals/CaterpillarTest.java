package com.singtel.animalkingdom.animals;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CaterpillarTest {

    private Caterpillar caterpillar;

    @Before
    public void setup(){
        caterpillar = new Caterpillar();
    }

    @Test
    public void testSoundBehaviour(){
        assertFalse("Caterpillar cannot make Sound",  caterpillar.makeSound());
    }

    @Test
    public void testSingBehaviour(){
        assertFalse("Caterpillar can not Sing",  caterpillar.sing());
    }

    @Test
    public void testFlyBehaviour(){
        assertFalse("Caterpillar can not Fly",  caterpillar.fly());
    }

    @Test
    public void testSwimBehaviour(){
        assertFalse("Caterpillar can not Swim",  caterpillar.swim());
    }

    @Test
    public void testWalkBehaviour(){
        assertTrue("Caterpillar can Walk",  caterpillar.walk());
    }

    @Test
    public void testSpecialBehaviour(){
        assertFalse("Caterpillar have no Special Behaviour",  caterpillar.speciality());
    }

    @Test
    public void testMetamorphosis(){
        assertThat("Caterpillar morphs into Butterfly", caterpillar.metamorphosis(), instanceOf(ButterFly.class));
    }
}
