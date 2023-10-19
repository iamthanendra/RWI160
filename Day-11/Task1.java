class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class TestPloymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Calls the Dog's makeSound method
        myCat.makeSound(); // Calls the Cat's makeSound method

        // Polymorphism in action: using an array of animals
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animal();

        for (Animal animal : animals) {
            animal.makeSound(); // Calls the appropriate makeSound method for each object
        }
    }
}
