class TestArray
{
    static void arrayType1(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            int[] subarray = new int[array.length - 1];
            int temp = array[array.length - 1];
            for(int j = 0, k = 0; j < subarray.length ; k++ )
            {
                if(k == i)
                {
                    temp = array[k];
                    continue;
                }
                subarray[j] = array[k];
                j++;
            }
            System.out.println("After "+(i+1)+" Iteration : ");
            System.out.println(java.util.Arrays.toString(subarray) +" "+temp+" is removed");
        }
    }
    public static void main(String[] args)
    {
        int[] array = {10,20,30, 40,50, 60};
        arrayType1(array);
    }
}