package Inheritance;
import Inheritance.Animal;
import Inheritance.Dog;
public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"longsilky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
