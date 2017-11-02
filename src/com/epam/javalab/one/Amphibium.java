package com.epam.javalab.one;

/**
 * Created by User on 002 02.11.17.
 */
public class Amphibium extends Bacterium implements Evolution, Swimming {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Amphibium(String name, int age, int weight, int height) {
        super(name, age);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String evoluteIt(String evoluteTo) {
        return ("I'm evolute to -> " + evoluteTo);
    }

    public void swimming(){
        System.out.println("Yeap yeap i can swim!");;
    }
}
