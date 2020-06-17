package bai7_Abstract_interface.thucHanh;

public class chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried: ";
    }
}
