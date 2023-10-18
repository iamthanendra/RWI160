interface Display
{
    public static void info(Display d)
    {
        d.msg();
    }
    public void msg();
}

class A implements Display
{
    public void msg()
    {
        System.out.println("This is Class A");
    }
}

class B implements Display
{
    public void msg()
    {
        System.out.println("This is Class B");
    }
}

class Test
{
    public static void main(String[] args)
    {
        Display d = new A(); //late binding
        Display.info(d);
        
        Display.info(new B());
    }
}