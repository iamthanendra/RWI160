class TryStudent
{
	int id;
	String name;
	TryStudent() //Default Constructor or Non-Parameterized Constructor or Constructor with no arguments
	{
		System.out.println("This is Default");
	}
	TryStudent(int id, String name) //Parameterized Constructor
	{
		this.id = id;
		this.name = name;
	}
	TryStudent(TryStudent c) //Copy Constructor
	{
		id = c.id;
		name = c.name;		
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		TryStudent c1 = new TryStudent();
		TryStudent c2 = new TryStudent(18,"Thanendra");
		TryStudent c3 = new TryStudent(c2);
		c1.display();
		c2.display();
		c3.display();
	}
}