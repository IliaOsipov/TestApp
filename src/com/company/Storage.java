package com.company;

public class Storage {
    private int AmountOfHumans = 10;
    private int LastFree;
    Person[] Humans;

    /** Construct Method "Storage".
     * Initializes Object of class "Storage".
     * Creates massive of Person with amount of 10.
     */
    public Storage() {
        Humans = new Person[AmountOfHumans];
        LastFree = 0;
    }

    /**Method "AddHuman"
     * Adds object of Person to massive of Person.
     * If the number of new element larger than massive size, then it creates new massive with increased size.
     * @param Human object of Person that should be added to massive.
     */
    public void AddHuman(Person Human) {
        if (LastFree < AmountOfHumans){
            Humans[LastFree] = Human;
            LastFree++;
        }
        else {
            AmountOfHumans++;
            Person[] NewHumans = new Person[AmountOfHumans];
            for(int i = 0; i < Humans.length; ++i){
                NewHumans[i] = Humans[i];
            }
            NewHumans[LastFree] = Human;
            LastFree++;
            Humans = NewHumans;
        }
    }

    /** Method "GetHumanOfNumber"
     * Searches for Person of given number.
     * If the number larger than massive size, then it returns the last element.
     * @param n number of Person that should be found.
     * @return returns object of Person.
     */
    public Person GetHumanOfNumber(int n){
        if (n >= AmountOfHumans)
            return Humans[AmountOfHumans - 1];
        else {
            return Humans[n];
        }
    }
}
