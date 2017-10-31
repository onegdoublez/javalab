package com.epam.javalab.one;

import javax.naming.Name;

/**
 * Created by User on 031 31.10.17.
 */
public class Amphibian extends Bacterium {
    private String classOfLive;

    public Amphibian(String name, int age, String classOfLive){
        super(name,age);
        this.classOfLive=classOfLive;
    }
    public String breath(){
        return "Oh my godable, i can breath?! WTF?!";
    }
    public String eat(String meal){
        return ("OMG ITS IS " + meal + " I CAN EAT IT");
    }
    public void evoluteIt(){
        System.out.println("I'm evolute from Bacteria");
        System.out.println("And i will evolute to the Animals");
    }

    @Override
    public String toString() {
        return ("Amphibian->" + getName() + " YEAP YEAP IT IS ME!" + " My Age:"+ getAge());
    }
}
