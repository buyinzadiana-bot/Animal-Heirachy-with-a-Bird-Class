public class Main {

    public static void main(String[] args) {

        // Create animals
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        // Polymorphism in action
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

        // Bird-specific behavior
        Bird myBird = new Bird();
        myBird.fly();
    }
}
