import java.util.LinkedHashSet;
import java.util.Iterator;
class TestLinkedSet
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> lnkset = new LinkedHashSet<>();
        //dont allow duplicate and store data in adding sequence

        lnkset.add(10);
        lnkset.add(10);
        
        lnkset.add(80);
        lnkset.add(20);
        lnkset.add(20);
        lnkset.add(10);
        lnkset.add(70);
        lnkset.add(80);
        
        Iterator<Integer> itr = lnkset.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next());
            if(itr.hasNext()) System.out.print(" -> ");
        }

    }
}