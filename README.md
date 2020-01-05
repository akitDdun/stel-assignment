# stel-assignment
Coding Assignment by Ankit Gupta (akit.ddun@gmail.com)
***********************************************************
********************* Section A ***************************

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

Question 4(a,b,c,d): Since my Sound Behaviour is configurable, Parrot can easily mimic other animals. Please see Solution.Java

***********************************************************


************************ Section B ************************

Question 1: Fish Model is implemented.

Question 2: Shark and ClownFish with special behaviours are implemented.

Question 2: Dolphin is implemented and is not reheated to Fish.

***********************************************************

************************ Section D ************************

Question 1: ButterFly created which can fly but can't make sound.

Question 2: Caterpillar implemented which cannot fly but can walk and can morph into Butterfly via metamorphosis.

***********************************************************

************************ Section E ************************

Question 1: Code to count is implemented in CountingAnimals.java
Note: The animals objects could be created by using builder pattern,
but since currently the object creation complexity is not much, I am not using builder for object creation.

***********************************************************

************************ Bonus ****************************

Question 1: Sound Library with Multiple Locale implemented. These Locales are configurable and can be changed as per the requirement.

Question 2: Sorry, couldn't implement within time range of 1.5 Hrs.

***********************************************************