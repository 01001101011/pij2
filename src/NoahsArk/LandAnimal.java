package NoahsArk;

public abstract class LandAnimal implements Animal{
    public void call(String animal) {
        System.out.println(animal + " is coming.. ");
    }
}

abstract class Bear extends LandAnimal {
    public void call(String bear) {
    }
    public void giveBirth() {
    }
    public void makeSound() {
        System.out.println("AAAAAAWWW");
    }
}