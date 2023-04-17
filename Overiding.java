// Overriding and overloading examples
//class Calculator {
//    public int subtract(int a, int b) {
//        return a - b;
//    }
//
//    public int subtract(int a, int b, int c) { // overload the subtract method with a different order of parameters
//        return a - b - c;
//    }
//}
//
//public class Overiding {
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.subtract(10, 5));
//        System.out.println(calculator.subtract(20, 5, 3));
//    }
//}

//class Calculator {
//    public int add(int a, int b) {
//        return a + b;
//    }
//
//    public double add(double a, double b) { // overload the add method with different data types of parameters
//        return a + b;
//    }
//}
//
//public class Overiding {
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.add(1, 2));
//        System.out.println(calculator.add(1.5, 2.5));
//    }
//}

//class Animal {
//    public void makeSound() {
//        System.out.println("Animal is making a sound.");
//    }
//}
//
//class Cat extends Animal {
//    public void makeSound() { // override the makeSound method with the same return type
//        System.out.println("Meow!");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal animal = new Cat();
//        animal.makeSound();
//    }
//}



class Animal {
    public Object makeSound() {
        System.out.println("Animal is making a sound.");
        return new Object();
    }
}

class Cat extends Animal {
    @Override
    public String makeSound() { // override the makeSound method with a different return type
        System.out.println("Meow!");
        return "Meow!";
    }
}

public class Overiding {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.makeSound();
    }
}
