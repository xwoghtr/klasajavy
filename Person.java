package com.company;

public class Person {

    public String name;
    public String surname;

    public Person(String surname) {
        this.name = "Andrzej";
        this.surname = surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public void greet() {
        System.out.println("Hi I'm " + name + " " + surname);
    }

    public String getNameAndSurname() {
        if (name == null) {
            return "";

        }
        return name + " " + surname;
    }
}
