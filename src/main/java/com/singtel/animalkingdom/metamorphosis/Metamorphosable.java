package com.singtel.animalkingdom.metamorphosis;

import com.singtel.animalkingdom.Animal;

public interface Metamorphosable<T extends Animal> {
    T metamorphosis();
}
