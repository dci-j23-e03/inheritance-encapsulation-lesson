public class Cat extends Animal {

    public Cat(String name, int age, String breed) {
        super(name, age, breed);
    }

    public void makeSound() {
        super.makeSound();
        System.out.println("Cat is meowing!");
    }
}
