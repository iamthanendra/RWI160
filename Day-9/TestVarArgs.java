class TestVarArgs
{
    //There should be only one various agument in method and its should to last parameter
    public static void sum(String message,int... arr)//can receive various arguments
    {
        int sum = 0;
        for(int i: arr)
        {
            sum+=i;
        }
        System.out.println(message+sum);
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{150, 50, 80};
        sum("Sum is :",10,20,30);
        sum("Sum is :", 10,20,30, 150, 50, 80, 90, 100 );
        
    }
}