class A
{
    void msg1()
    {
        System.out.println("msg1:A");
    }
    void msg2()
    {
        System.out.println("msg2:A");
    }
}
class B extends A
{
    @Override
    void msg2()
    {
        System.out.println("msg1:B");
    }
}
class Test
{
    public static void main(String[] args)
    {
        A ob = new B();
        ob.msg1();
        ob.msg2();
    }
}