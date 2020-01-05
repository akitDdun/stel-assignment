# stel-assignment
Coding Assignment by Ankit Gupta
***********************************************************

Question 1(a): wrote junit test case BirdTest.java

Question 1(b): I used Strategy Pattern to break down the behaviours/actions,
 so that they can be applied in a more granular manner to different variety of animals.

***********************************************************

Question 2(a,b,c,d): Implemented Duck and Chicken with their Distinct Sounds using SoundBehaviour and a Sound Lib (Enum).
This Sound Lib will later be helpful in implementing multilingual animal calls.
Also, the distinct actions like Swim and Chicken not flyable are implemented using Behaviours.

***********************************************************

Question 3(a): Roster with configurable sound Behaviour implemented
Question 3(b): Rooster IS-A Chicken, (Inheritance)
Question 3(c): Rather than modeling Rooster as a sub class of Chicken,
I am considering rooster as special kind of chicken with some properties different from Chicken.
So I didn't really created a Rooster class, Rather made the Sound Configurable, so Chicken itself can be used as a Rooster.
Since anyways rooster IS-A Chicken. (See Solution Class)

***********************************************************

Question 4(a,b,c,d): Since my Sound Behaviour is configurable, Parrot can easily mimic other animnals. Please see Solution.Java

***********************************************************
