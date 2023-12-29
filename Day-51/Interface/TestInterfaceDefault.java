//Java 8 Program
interface Drawable
{
	void draw();
	default void msg()
	{
		System.out.println("default method");
	}
}

class Rectangles implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing rectangle");
	}
}

class TestInterfaceDefault extends Rectangles
{
	public static void main(String[] args)
	{
		Drawable d = new Rectangles();
		d.draw();
		d.msg();
	}
}