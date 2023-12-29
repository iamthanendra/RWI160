//Single Inheritance
class Animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
}

class TestInheritance
{
	public static void main(String[] args)
	{
		Dog d = new Dog();
		d.bark();
		d.display();
		
		//Dog x = new Animal(); // Compile Time Error
		//Animal a = new Dog();
		//a.eat();
		//a.bark(); // Compile Time Error
	}
}