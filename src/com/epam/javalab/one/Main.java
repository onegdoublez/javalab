package com.epam.javalab.one;


public class Main {
    public static void main(String[] args) {
    Amphibium a = new Amphibium("First Amphibium",10000,200,300,true);
    System.out.println(a.toString());
    a.swimming();
    Animal z = new Animal();
    z.voice("Bark");
    }
}
