import java.math.BigInteger;
class TestStringComparison3 
{
	public static void main(String[] args) 
	{
		BigInteger b = new BigInteger("5");
		int i = 5;
		System.out.println(b.intValue() == i);
//		System.out.println(i.equals(b.intValue()));
	}
}
