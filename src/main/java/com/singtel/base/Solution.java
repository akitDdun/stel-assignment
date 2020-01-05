package com.singtel.base;

import com.singtel.animalkingdom.Animal;
import com.singtel.animalkingdom.animals.*;

public class Solution {
    public static void main(String[] args) {
        Animal bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        Animal duck = new Duck();
        duck.walk();
        duck.fly();
        duck.swim();
        duck.makeSound();

        Animal chicken = new Chicken();
        chicken.makeSound();
        chicken.fly();

        Animal rooster = new Chicken("Rooster");
        rooster.makeSound();

        Animal parrotWithRooster = new Parrot("Rooster");
        parrotWithRooster.makeSound();

        Animal parrotWithDogs = new Parrot("Dog");
        parrotWithDogs.makeSound();

        Animal parrotWithCats = new Parrot("Cat");
        parrotWithCats.makeSound();
    }
}
