class Animal
{  
    void eat()
    {
        System.out.println("eating...");
    }  
    void sound()
    {
	System.out.println("Sound Like animal");
    }
}  
class Dog extends Animal
{  
    @Override
    void sound()
    {
        System.out.println("barking...");
    }  
}  
class Cat extends Animal
{  
    @Override
    void sound()
    {
        System.out.println("meowing...");
    }  
}

class Main
{  
    public static void main(String[] args)
    {  
        Animal animal;
        
        animal = new Dog();
        animal.sound();  //Dynamic Method Dispatching
        
        animal = new Cat();
        animal.sound();  //Dynamic Method Dispatching
        
    }
    
}  