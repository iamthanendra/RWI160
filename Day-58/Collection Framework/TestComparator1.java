import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
// import java.util.Comparable;
import java.util.Comparator;

class IdComparator implements Comparator<Emp>
{
    public int compare(Emp o1, Emp o2)
    {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

class Emp 
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
    public String toString()
    {
        return "{Id: "+this.id+", Name: "+this.name+"}";
    }
}

class Test
{
    public static void main(String[] args)
    {
        LinkedList<Emp> list = new LinkedList<>();
        list.add(new Emp(10, "nen"));
        list.add(new Emp(9, "Tha"));
        list.add(new Emp(11, "dra"));
        list.add(new Emp(12, "thanendra"));
        list.add(new Emp(13, "Li Poo Poo"));
        Collections.sort(list, new IdComparator());
        System.out.println(list);
        }
}