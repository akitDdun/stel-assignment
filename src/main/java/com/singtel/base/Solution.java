package com.singtel.base;

import com.singtel.animalkingdom.Animal;
import com.singtel.animalkingdom.animals.*;

public class Solution {
    public static void main(String[] args) {
        Animal bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
