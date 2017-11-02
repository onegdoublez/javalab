package com.epam.javalab.one;

/**
 * Created by User on 002 02.11.17.
 */
public abstract class Bacterium {

    private String name = "Eubacteria";
    private int age = 10000;

    public Bacterium(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Bacterium() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
