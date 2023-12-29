class CopyConstruct2
{
	int id;
	String name;
	CopyConstruct2() // We must have to create Default Constructor
	{
	}
	CopyConstruct2(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		CopyConstruct2 s1 = new CopyConstruct2(18,"Thanendra");
		CopyConstruct2 s2 = new CopyConstruct2();
		s2.id = s1.id;
		s2.name = s1.name;
		s1.display();
		s2.display();
	}
}