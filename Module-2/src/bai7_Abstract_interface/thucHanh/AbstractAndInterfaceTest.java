package bai7_Abstract_interface.thucHanh;

import animal.Animal;
import animal.chicken;
import animal.Tiger;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals[0]= new Tiger();
        animals [1] = new chicken();
        for (Animal animal: animals){
            animal.makeSound();
        }
    }
}
