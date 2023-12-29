abstract class Shapes
{
	abstract void draw();
}

class Rectangles extends Shapes
{
	void draw()
	{
		System.out.println("Rectangle is drawing...");
	}
}


class Circles extends Shapes
{
	void draw()
	{
		System.out.println("Circle is drawing...");
	}
}

class TestAbstraction1
{
	public static void main(String[] args)
	{
		Shapes s = new Circles();
		s.draw();
	}
}