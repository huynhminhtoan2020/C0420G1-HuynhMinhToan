package bai7_Abstract_interface.thucHanh;


public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof chicken) {
                Edible edible = (chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
