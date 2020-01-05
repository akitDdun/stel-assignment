package com.singtel.animalkingdom.behaviour.sounds;

public enum SoundsLibrary {
    Duck { public String sound() { return "Quack, quack"; } },
    Chicken { public String sound() { return "Cluck, cluck"; } },
    Rooster { public String sound() { return "Cock-a-doodle-doo"; } },
    Dog { public String sound() { return "Woof, woof"; } },
    Cat { public String sound() { return "Meow"; } },
    Bird { public String sound() { return "I am Singing"; } };

    public abstract String sound();
}
