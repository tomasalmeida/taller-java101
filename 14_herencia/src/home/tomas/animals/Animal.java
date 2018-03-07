package home.tomas.animals;

public class Animal {

    private int age;


    public Animal() {
        System.out.println("He construido un animal");
    }
    
    public Animal(int age) {
        System.out.println("He construido un animal con edad");
        this.age = calculateAnimalAge(age);
    }

    final public void eat() {
        System.out.println("Animal eats.");
    }

    private int calculateAnimalAge(int age) {
        return age * 7;
    }

    static void describeAnimal() {
        System.out.println("Aqui se describe un animal.");
    }

}
