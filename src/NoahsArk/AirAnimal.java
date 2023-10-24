package NoahsArk;

public abstract class AirAnimal implements Animal{
    public void call(String animal) {
        System.out.println(animal + " is now flying, will come later when tired.");
    }
}

abstract class Eagle extends AirAnimal {
    public void call(String eagle) {
    }
    public void layEggs() {
    }
    public void makeSound() {
        System.out.println("kawwwww");
    }
}