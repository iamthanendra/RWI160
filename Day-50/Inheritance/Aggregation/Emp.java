//Aggregation ( HAS - A relationship )

class Address
{
	String city;
	String state;
	String country;

	Address(String city, String state, String country)
	{
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

class Emp
{
	int id;
	String name;
	Address add; //Aggegation
	
	Emp(int id, String name, Address add)
	{
		this.id = id;
		this.name = name;
		this.add = add;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(add.city+" "+add.state+" "+add.country);
	}

	public static void main(String args[])
	{
		Address add1 = new Address("Bsp", "C.G.", "India");
		Address add2 = new Address("Jarhagaon", "C.G.", "Bharat");

		Emp e1 = new Emp(111, "Thanendra", add1);
		Emp e2 = new Emp(112, "Mintu", add2);

		e1.display();
		e2.display();
	}
}