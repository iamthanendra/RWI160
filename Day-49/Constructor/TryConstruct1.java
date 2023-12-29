//In this program we try to copy two different class construct without constructor
class Construct1 
{
	int id;
	String name;
	Construct1() //Default Constructor
	{
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
	Construct2() //Default Constructor
	{
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

class TryConstruct1
{
	public static void main(String[] args)
	{
		Construct1 c1 = new Construct1();
		Construct1 c2 = new Construct1(18,"Thanendra"); 
		Construct2 s1 = new Construct2();
		Construct2 s2 = new Construct2(19,"Mintu");
		c1 = (Construct1)s2;
		s1 = (Construct2)c2;
		c1.display();
		c2.display();
		s1.display();
		s2.display();
	}
}