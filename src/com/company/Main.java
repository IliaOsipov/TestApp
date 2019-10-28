package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       //System.out.println("Hello world!");
        //Person Human = new Person();
        //System.out.println(Human.getAge());
        //System.out.println(Human.getBirthday().toString());
        //System.out.println(Human.getFIO().toString());
        Storage Store = new Storage();
        for (int i = 0; i < 12; ++i) {
            Person Human = new Person();
            Store.AddHuman(Human);
        }
        //System.out.println(Store.GetHumanOfNumber(11).getAge());
    }
}
