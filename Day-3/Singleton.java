//Singleton Design Pattern Class
class Singleton
{
    //Lazy Intialization
    static Singleton instance = null;
    int id = 10;
    private Singleton()
    {
    }
    static Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
            return instance;
        }
    return instance;
    }

}
class Test {
public static void main(String[] args) {
    Singleton ob1 = Singleton.getInstance();
    System.out.println(ob1.id);
    ob1.id = 20;
    System.out.println(ob1.id);
    Singleton ob2 = Singleton.getInstance();
    System.out.println(ob2.id);
    ob2.id = 30;
    System.out.println(ob2.id);
    Singleton ob3 = Singleton.getInstance();
    System.out.println(ob3.id);
    ob3.id = 40;
    System.out.println(ob3.id);
}
}
