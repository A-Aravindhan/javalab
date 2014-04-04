package com.liquidlab.javalab.defaultmethods;

/**
 * Created by tham on 4/4/2014.
 */
public class Cat implements Pet {

    @Override
    public boolean canSleep() {
        return true;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.canBark());
    }
}
