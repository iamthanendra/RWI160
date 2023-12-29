class TryConstruct
{
	int i;
	TryConstruct(int i)
	{
		this.i = this.i;
	}
	public static void main(String[] args) 
	{
		TryConstruct ob = new TryConstruct(18);
		System.out.println("Hello World! "+ob.i);
	}
}
