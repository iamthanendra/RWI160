import java.util.TreeSet;
import java.util.Collections;
class TestTreeSet1
{
    public static void main(String... args)
    {
        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
        //will be store in Descending order;    
        ts.add(6262);
        ts.add(212);
        ts.add(637);
        ts.add(89289);
        ts.add(21);
        ts.add(8382);
        ts.add(829);
        ts.add(3920);
        ts.add(83920);
        ts.add(821);
        
        for(Integer itr : ts)
        {
            System.out.print(itr + " < ");
        }
    }
}