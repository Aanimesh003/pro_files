class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Poly {
    public static void main(String[] args) {
        Animal ob1 = new Dog();
        Animal ob2 = new Cat();
        
        ob1.makeSound(); // output: "Bark"
        ob2.makeSound(); // output: "Meow"
    }
}
