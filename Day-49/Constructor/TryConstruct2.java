//In this program we try to copy two different class construct with construct
class Construct1 
{
	int id;
	String name;
	Construct1(Construct2 s) //Copy Constructor
	{
		id = s.id;
		name = s.name;
	}
	Construct1(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
}

class Construct2
{
	int id;
	String name;
	Construct2(Construct1 s) //Copy Constructor
	{
		id = s.id;
		name = s.name;
	}
	Construct2(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
}

class TryConstruct2
{
	public static void main(String[] args)
	{
		Construct1 c2 = new Construct1(18,"Thanendra"); 
		Construct2 s1 = new Construct2(c2);
		Construct2 s2 = new Construct2(19,"Mintu");
		Construct1 c1 = new Construct1(s2);	
		c1.display();
		c2.display();
		s1.display();
		s2.display();
	}
}