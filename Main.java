package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person person1 = new Person("John ", "Snow");

        NameSweeper.changeName(person1);
//        Person person2 = new Person("Mark ", "Twain");
//        Person person3 = new Person("Musk");
//        person1.name="John";
//        person1.surname="Snow";
//        Person person2 = new Person();
//        person2.name="Mark";
//        person2.surname="Twain";


//        person2=person1;
//
//        person2.name="Andrzej";
        person1.greet();
//        person2.greet();
//        person3.greet();
    }
}
