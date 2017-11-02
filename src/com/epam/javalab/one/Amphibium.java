package com.epam.javalab.one;

/**
 * Created by User on 002 02.11.17.
 */
public class Amphibium extends Bacterium implements Evolution, Swimming {
    private String name;
    private int age;
    private int weight;
    private int height;
    private boolean isLive;

    public Amphibium(String name, int age, int weight, int height, boolean isLive) {

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.isLive = isLive;
    }

    public Amphibium(int age, int weight, int height, boolean isLive) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.isLive = isLive;
    }

    public Amphibium() {
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

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    @Override
    public String evoluteIt(String evoluteTo) {
        return ("I'm evolute to -> " + evoluteTo);
    }

    public void swimming(){
        System.out.println("Yeap yeap i can swim!");;
    }

    @Override
    void born() {
        System.out.println("I'm born");
    }

    @Override
    public String toString() {
        return "Amphibium{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", isLive=" + isLive +
                '}';
    }
}
