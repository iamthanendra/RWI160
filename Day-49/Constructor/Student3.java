class Student3
{
	int id;
	String name;
	int age;
	Student3(int i, String n)
	{
		 id = i;
		name = n;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age); //Age Value provided by this/default constructor but compiler didn't create the default constructor
	}
	public static void main(String[] args) 
	{
		Student3 s1 = new Student3(4,"Thanendra");
		//Student3 s2 = new Student3(); //Error // Compiler didn't create the default constructor
		s1.display();
	}
}