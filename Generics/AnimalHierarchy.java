import java.util.*;

class Animal {
    public void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {}

class Cat extends Animal {}

public class AnimalHierarchy {

    public static void printAnimals(List<? extends Animal> animals) {
        for(Animal a : animals) {
            a.sound();
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());

        printAnimals(dogs);
    }
}