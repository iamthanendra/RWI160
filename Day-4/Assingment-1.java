//Using of String
class TestString
{
    public static void main(String[] args)
    {
        String st1 = "Thanendra Kashyap"; //Using Litrelas
        String st2 = new String("Thanendra Kashyap"); // Using Object
        String st3 =  "Thanendra Kashyap";// Using Litrelas
        
        System.out.println(st1 == st3); // True
        System.out.println(st1 == st2); //False
        
        
        System.out.println(st1.intern() == st2.intern()); 
        //will not compare canonical form
        
        System.out.println(st1.equals(st2)); 
        System.out.println(st1.equalsIgnoreCase(st2)); 
        
    }
}