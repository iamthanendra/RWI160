import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
// import java.util.Comparable;

class Emp implements Comparable<Emp>
{
    private int id;
    private String name;
    public Emp(){}
    public Emp(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public int compareTo(Emp that)
    {
        return this.id - that.id;
    }
    public String toString()
    {
        return "{Id: "+this.id+", Name: "+this.name+"}";
    }
}

class TestComparable1
{
    public static void main(String[] args)
    {
        LinkedList<Emp> list = new LinkedList<>();
        list.add(new Emp(10, "nen"));
        list.add(new Emp(9, "Tha"));
        list.add(new Emp(11, "dra"));
        list.add(new Emp(12, "thanendra"));
        list.add(new Emp(13, "Li Poo Poo"));
        Collections.sort(list);
        System.out.println(list);
        }
}