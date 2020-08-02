abstract class Animal {
    private String name;
    
    Animal(String name) {
        this.name = name;
    }
    public abstract void makeSound() ;
}

class Dog extends Animal {
    Dog() {
        super("Dog");
    }

    public void makeSound() {
        System.out.println("Whoof !!!");
    }

}

class Cow extends Animal {
    Cow() {
        super("Cow");
    }

    public void makeSound() {
        System.out.println("Moo !!!");
    } 
}

public class TestAnimal {

    public void makeSound(Animal animal){
        animal.makeSound();
    }

    public static void main(String[] args) {

        new Animal();

        TestAnimal test = new TestAnimal();
        test.makeSound(new Dog());
        test.makeSound(new Cow());
    }
}