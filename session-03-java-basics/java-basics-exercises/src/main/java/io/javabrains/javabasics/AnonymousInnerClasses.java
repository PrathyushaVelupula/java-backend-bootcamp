package main.java.io.javabrains.javabasics;

 abstract class Animal2{
    abstract void makeSound();
}
/*
Create a class `Animal2` with an abstract method `makeSound`.
Create an anonymous inner class implementation of `Animal2` and then call the `makeSound` method
 */

public class AnonymousInnerClasses {
    public static void main(String[] args) {
        Animal2 animal = new Animal2() {
            void makeSound() {
                System.out.println("BOW BOW BOW !!!");
            }
        };
        animal.makeSound();
    }
}