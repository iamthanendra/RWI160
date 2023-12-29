class CopyConstruct3 
{
	int id;
	String name;
	CopyConstruct3()// We must have to create Default Constructor
	{
	}
	CopyConstruct3(int id, String name)
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
		CopyConstruct3 s1 = new CopyConstruct3();
		CopyConstruct3 s2 = new CopyConstruct3(18,"Thanendra");
		s2 = s1;
		s1.display();
		s2.display();
		CopyConstruct3 s3 = new CopyConstruct3();
		CopyConstruct3 s4 = new CopyConstruct3(19,"Mintu");
		s3 = s4;
		s3.display();
		s4.display();
	}
}