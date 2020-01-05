package com.singtel.animalkingdom.behaviour.sounds;

public enum SoundsLibrary {
    English_Duck { public String sound() { return "Quack, quack"; } },
    English_Chicken { public String sound() { return "Cluck, cluck"; } },
    English_Rooster { public String sound() { return "Cock-a-doodle-doo"; } },
    English_Dog { public String sound() { return "Woof, woof"; } },
    English_Cat { public String sound() { return "Meow"; } },
    English_Bird { public String sound() { return "I am Singing"; } },

    Hindi_Duck { public String sound() { return "Kaan – Kaan"; } },
    Hindi_Chicken { public String sound() { return "Kukdooku"; } },
    Hindi_Rooster { public String sound() { return "Kukdooku-Kukdooku"; } },
    Hindi_Dog { public String sound() { return "Bhoo Bhoo"; } },
    Hindi_Cat { public String sound() { return "Meow Meow"; } },
    Hindi_Bird { public String sound() { return "I am Singing"; } };

    public abstract String sound();
}
