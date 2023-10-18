enum Color
{
    RED, GREEN, BLUE, PURPLE;
}

class Person
{
    String name;
    int id;
    Color color;
    Person(int id, String name, Color color)
    {
        this.id = id;
        this.name = name;
        this.color = color;
    }
    public String toString()
    {
        return "id\t\t: "+this.id+"\nname\t: "+this.name+"\ncolor\t: "+this.color.ordinal()+"("+this.color+")\n";
    }
}

class Test
{
    public static void main(String[] args)
    {
        Person person1 = new Person(160, "Thanendra", Color.PURPLE);
        System.out.println(person1);
        
        Person person2 = new Person(161, "Thanendra Kashyap", Color.BLUE);
        System.out.println(person2);
    }
}