package com.singtel.base;

import com.singtel.animalkingdom.Animal;
import com.singtel.animalkingdom.animals.*;

public class CountingAnimals {
    public static void main(String[] args) {

        int flyCount = 0;
        int swimCount = 0;
        int walkCount = 0;
        int singCount = 0;

        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Chicken("Rooster"),
                new Parrot("Dog"),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Caterpillar().metamorphosis() //Butterfly is restricted to be only created from a caterpillar
        };

       for(Animal animal : animals){
           if(animal.fly()){
               flyCount++;
           }
           if(animal.sing()){
               singCount++;
           }
           if(animal.walk()){
               walkCount++;
           }
           if(animal.swim()){
               swimCount++;
           }
       }
        System.out.println("Flying Animals :"+flyCount);
        System.out.println("Singing Animals :"+singCount);
        System.out.println("Walking Animals :"+walkCount);
        System.out.println("Swimming Animals :"+swimCount);
    }
}
