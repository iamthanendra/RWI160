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
		System.out.println("Barking");
	}
}

class Cat extends Animal
{
	void meow()
	{
		System.out.println("Meowing...");
	}
}

class TestInheritance3
{
	/*static
	{
		Dog d = new Dog();
		d.bark();
		d.eat();
		//d.meow(); // Compile Time Error
		Cat c = new Cat();
		c.meow();
		c.eat();
		//c.bark();//Compile Time Error
	}*/
	public static void main(String args[])
	{
		Dog d = new Dog();
		d.bark();
		d.eat();
		//d.meow(); // Compile Time Error
		Cat c = new Cat();
		c.meow();
		c.eat();
		//c.bark();//Compile Time Error
	}
}