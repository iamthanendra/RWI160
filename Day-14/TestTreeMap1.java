import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;

class TestTreeMap1
{
    public static void main(String[] args)
    {
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(121, "sa");
        tm.put(32, "re");
        tm.put(12, "ga");
        tm.put(11, "ma");
        tm.put(21, "pa");

        System.out.println("Iterating...");
        for(Map.Entry em: tm.entrySet())
        {
            System.out.println(em.getKey()+" -> "+em.getValue());
        }

        System.out.println("Iterating using keys...");
        for(Map.Entry em: tm.entrySet())
        {
            System.out.println(em.getKey()+" -> "+em.getValue());
        }

        // Iterator<Iterator> itr = tm.keySet().iterator();

        // while(itr.hasNext())
        // {
        //     int key = itr.next();
        //     System.out.println(key+" -> "+tm.get(key));
        // }
        
    }
}