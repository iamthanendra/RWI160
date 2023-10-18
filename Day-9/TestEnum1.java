enum Color
{
    RED, GREEN , BLUE;
    void info()
    {
        System.out.println("This is Color which i used ");
    }
}
class Test
{
    public static void main(String[] args)
    {
        for(Color itr : Color.values())
        {
            System.out.println(itr);
            itr.info();
        }
    }
}