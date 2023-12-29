//Multilevel Inheritance
class Animal
{
	void eat()
	{
		System.out.println("Eating..");
	}
}

class Dog extends Animal
{
	//eat();
	void bark()
	{
		System.out.println("Barking...");
	}
}

class Baby extends Dog
{
	//eat();
	//bark();
	void weep()
	{
		System.out.println("Weeping...");
	}
}

class TestInheritance2
{
	public static void main(String args[])
	{
		Baby b = new Baby();
		b.eat();
		b.bark();
		b.weep();
		//new Baby().eat();  //Using Anonymous object
		//new Baby().bark(); //Using Anonymous object
		//new Baby().weep(); //Using Anonymous object
	}
}