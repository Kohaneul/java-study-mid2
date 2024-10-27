package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물",1);
        Dog dog = new Dog("강아지",100);
        Cat cat = new Cat("고양이",50);
        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);

        Animal animal1 = animalBox.get();

        System.out.println("animal1 = " + animal1);


    }
}
