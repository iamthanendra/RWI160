import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

//dont allows duplicate keys
class TestHashMap1
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> hs = new HashMap<>();
        hs.put(1,"Thanendra");
        hs.put(3,"Kashyap");
        hs.put(2,"RWI160");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m: hs.entrySet())
        {
            System.out.println(m.getKey()+" -> "+m.getValue());
        }

        hs.put(2,"Railworld");
        System.out.println(hs.get(2));

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m: hs.entrySet())
        {
            System.out.println(m.getKey()+" -> "+m.getValue());
        }

        System.out.println("Iterating using Keys...");
        
        Iterator<Integer> itr = hs.keySet().iterator();
        while(itr.hasNext())
        {
            int key = (int)itr.next();
            System.out.println(key+" -> "+hs.get(key));
        }


    }
}