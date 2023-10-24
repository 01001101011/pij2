package NoahsArk;

public abstract class AquaticAnimal implements Animal {
    public void call(String animal) {
        System.out.println(animal + " will not come.");
    }
}
abstract class Whale extends AquaticAnimal {
    public void call(String whale) {
    }
    public void giveBirth() {
    }
    public void makeSound() {
        System.out.println("sonar sounds...");
    }
}