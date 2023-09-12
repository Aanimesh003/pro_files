
    class Animal {
        void eat() {
            System.out.println("Eating...");
        }
    }
    
    class Dog extends Animal {
        void bark() {
            System.out.println("Barking...");
        }
    }
    
    class Bulldog extends Dog {
        void play() {
            System.out.println("Playing...");
        }
    }
    
    public class multilevel {
        public static void main(String[] args) {
            Bulldog bulldog = new Bulldog();
            bulldog.eat();  // output: Eating...
            bulldog.bark(); // output: Barking...
            bulldog.play(); // output: Playing...
        }
    }
    

