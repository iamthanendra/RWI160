class Student1 
{
	int id;
	String name;
	Student1(int i, String n)
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
		Student1 s1 = new Student1(30,"Thanendra");
		s1.display();
	}
}
