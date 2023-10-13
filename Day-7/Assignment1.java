class Parent
{
    
    protected void property()
    {
        System.out.println("Parent Properties goes here....");
    }
}

class Child extends Parent
{
    @Override
    public void property()
    {
        super.property();
        System.out.println("Child Properties goes here....");
    }
}

class Test
{
    public static void main(String[] args)
    {
        Child thanendra = new Child();
        thanendra.property();
    }
}