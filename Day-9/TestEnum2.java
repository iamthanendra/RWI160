enum Color
{
    RED, SAFFRON{
        //Overriding info method
        public void info(){
            System.out.println("This is the color which i love most  ");
        }
    }, BLUE;
    public void info()
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