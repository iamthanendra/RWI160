class Square
{
	int sqr(int x)
	{
		return x*x;
	}
}

class Circle
{
	Square ob;//Aggregation
	double pi = 3.14;

	double area(int radius)
	{
		ob = new Square();
		int r = ob.sqr(radius);
		return r * pi;
	}

	public static void main(String args[])
	{
		Circle c = new Circle();
		double result = c.area(5);
		System.out.println("Area is : "+result);
	}
}