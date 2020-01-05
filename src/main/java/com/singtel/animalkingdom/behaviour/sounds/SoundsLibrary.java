package com.singtel.animalkingdom.behaviour.sounds;

public enum SoundsLibrary {
    Duck { public String sound() { return "Quack, quack"; } },
    Chicken { public String sound() { return "Cluck, cluck"; } },
    Rooster { public String sound() { return "Cock-a-doodle-doo"; } };

    public abstract String sound();
}
