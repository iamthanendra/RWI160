class StringAssignment3
{
    public static void main(String[] args)
    {
        //Empty String vs Null
        String s1 = ""; //Empty String
        String s2 = null;
        
        if(s1.length() ==0 )
        {
            System.out.println("String is Empty");
        }       
        if(s1.isEmpty())
        {
            System.out.println("String is Empty");
        }
        
        //will generate compile Time Error
        // if(s2.length() == 0 )
        // {
        //     System.out.println("String is Empty");
        // }       
        
        // if(s2.isEmpty())
        // {
        //     System.out.println("String is Empty");
        // }
        
        if(s2 == null )
        {
            System.out.println("String is Empty");
        }
        
        
    }
}