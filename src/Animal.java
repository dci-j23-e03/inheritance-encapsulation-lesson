public class Animal {
    private String name;
    private int age;
    private String breedString;

    public Animal() {}

    public Animal(String name, int age, String breedString) {
        this.name = name;
        this.age = age;
        this.breedString = breedString;
    }

    public void makeSound() {
        System.out.println("This is makeSound method in Animal class!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreedString() {
        return breedString;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void setBreedString(String breedString) {
        if (name != null && !name.equals("")) {
            this.breedString = breedString;
        }
    }
}
