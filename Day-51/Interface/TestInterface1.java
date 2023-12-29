interface Drawable
{
	void draw();
}

class Rectangles implements Drawable
{
	public void draw()
	{
		System.out.println("drawing Rectangle...");
	}
}

class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("drawing Circle...");
	}
}

class TestInterface1
{
	public static void main(String[] args)
	{
		Drawable d = new Circle();
		d.draw();
	}
}