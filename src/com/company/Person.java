package com.company;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class Person {
    private int ID;
    static private int AmountOfHumans = 0;
    private String FIO;
    private LocalDate Birthday;
    private String Gender;

    public Person() {
        this.ID = AmountOfHumans;
        AmountOfHumans++;
        FIO = "FIO";
        Birthday = new LocalDate();
        Gender = "Male";
    }

    public Person(String fio, LocalDate birthday, String gender){
        this.ID = AmountOfHumans;
        AmountOfHumans++;
        FIO = fio;
        Birthday = birthday;
        Gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public LocalDate getBirthday() {
        return Birthday;
    }

    public void setBirthday(LocalDate birthday) {
        Birthday = birthday;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    /** Method "getAge"
     * Counts current age of the Person.
     * @return the difference between current data and birthday of the Person.
     */
    public int getAge(){
        LocalDate currDate = new LocalDate();
        return currDate.getYear() - Birthday.getYear();
    }

}
