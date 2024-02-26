public class Dog extends Animal {

    public static final double PI = 3.14;
    private boolean isFluffy;

    public Dog(String name, int age, String breed, boolean isFluffy) {
        this(name, age, breed);
        this.isFluffy = isFluffy;
    }

    public Dog(String name, int age, String breed) {
        super(name, age, breed);
        System.out.println("We are in the Dog class constructor");
    }

    public void makeSound() {
        super.makeSound();
        System.out.println("Dog is barking!");
    }

    public boolean isFluffy() {
        return isFluffy;
    }

    public void setFluffy(boolean fluffy) {
        this.isFluffy = fluffy;
    }
}
