class CopyConstruct1 
{
	int id;
	String name;
	CopyConstruct1(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	CopyConstruct1(CopyConstruct1 c)
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
		CopyConstruct1 s1 = new CopyConstruct1(10,"Thanendra");
		CopyConstruct1 s2 = new CopyConstruct1(s1);
		s1.display();
		s2.display();
	}
}