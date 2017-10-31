package com.epam.javalab.one;

/**
 * Created by User on 031 31.10.17.
 */
public abstract class Bacterium {
    private String name;
    private int age;

    public Bacterium(String name, int age) {
        this.name = name;
        this.age = age;
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
