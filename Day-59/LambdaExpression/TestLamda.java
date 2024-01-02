@FunctionalInterface
interface Addition
{
	public int add(int a, int b);
}

class TestLamda
{
	public static void main(String[] args)
	{
		Addition d = (a, b) -> {
			return a+b;
		};
		System.out.println(d.add(10,20));

	}
}