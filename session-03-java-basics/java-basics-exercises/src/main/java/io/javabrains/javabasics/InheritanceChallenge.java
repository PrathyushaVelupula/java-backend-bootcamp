package main.java.io.javabrains.javabasics;

/*

1.  Create an `Animal` class with member variables for the name and age of the animal and a constructor method that initializes the member variables.
2.  Create a `Dog` class that extends the `Animal` class and has a member variable for the breed of the dog and a constructor method that initializes the member variables.
3.  Override the `makeSound` method in the `Dog` class to print "The dog barks".
4.  Create a `Cat` class that extends the `Animal` class and has a member variable for the number of lives of the cat and a constructor method that initializes the member variables.
5.  Override the `makeSound` method in the `Cat` class to print "The cat meows".
6.  In the `main` method of this class, create an array of `Animal` objects and initialize it with a `Lion`, a `Dog`, a `Cat`, and another `Animal` of your choice.
7.  Loop through the array of `Animal` objects and print the name, age, and sound of each animal.
 */


public class InheritanceChallenge {
    abstract static class Animal {
        String name;
        int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        abstract void makeSound();
    }

    public static class Dog extends Animal {
        String breedName;

        public Dog(String name, int age, String breedName) {
            super(name, age);
            this.breedName = breedName;
        }

        @Override
        public void makeSound() {
            System.out.println("The Dog Barks");
        }
    }

    public static class Cat extends Animal {
        int noOfLives;

        public Cat(String name, int age, int noOfLives) {
            super(name, age);
            this.noOfLives = noOfLives;
        }

        @Override
        public void makeSound() {
            System.out.println("The cat meows");
        }
    }


    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("buddy", 7, "Pomeranian"),
                new Cat("Ginger", 4, 9),
                new Animal("Lion", 3) {
                    public void makeSound() {
                        System.out.println("The Lion roars");
                    }
                },
                new Animal("Tiger", 9) {
                    public void makeSound() {
                        System.out.println("The Tiger roars");
                    }
                }
        };

        for (Animal animal : animals) {
            System.out.println("Name: " + animal.name);
            System.out.println("Age: " + animal.age);
            animal.makeSound();
        }
    }
}

