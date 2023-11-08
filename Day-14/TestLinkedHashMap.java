import java.util.LinkedHashMap;
import java.util.Map;

class TestLinkedHashMap
{
    public static void main(String[] args)
    {
        Map<Integer, String> mp = new LinkedHashMap<>();
        mp.put(10,"Thanendra");
        mp.put(9,"Tha");
        mp.put(11,"nen");
        mp.put(15,"dra");
        mp.put(1,"dra");

        System.out.println("Iteration....");
        for(Map.Entry m : mp.entrySet())
        {
            System.out.println(m.getKey()+" -> "+m.getValue());
        }


        System.out.println("Iteration using key....");
        Iterator<Integer> itr = mp.keySet().iterator();
        while(itr.hasNext())
        {
            int key = (int)itr.next();
            System.out.println(key+" -> "+itr.get(key));
        }
    }
}