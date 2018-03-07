package home.tomas.animals;

public class Mammal extends Animal {

    private int mammalAge;

    public Mammal() {
        super(4);
        this.mammalAge = calculateAnimalAge(7);
        System.out.println("he construido un mammal");
    }

    public void eat(int a) {
        System.out.println("Mammal eats");
        super.eat();
    }

    private int calculateAnimalAge(int age) {
        return 3 * age;
    }

    public static void describeAnimal() {
        System.out.println("Aqui se describe un animal mamifero.");
    }
}
