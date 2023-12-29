class Student2 
{
	int id;
	String name;
	Student2()//Must create the Default Constructor Compiler didn't create default constructor automatically if parameterized constuctor is created
	{
		System.out.println("Hello World");
	}
	Student2(int i , String n)
	{
		 id = i;
		name = n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		Student2 s1 = new Student2();//Object of Default Constructor
		//Student2 s2 = new Student2(20); //Error // Parameter Required
		Student2 s3 = new Student2(30,"Thanendra");
		s1.display();
		s3.display();
	}
}