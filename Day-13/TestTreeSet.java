import java.util.TreeSet;
import java.util.Iterator;
class TestTreeSet
{
    public static void main(String[] args)
    {
        TreeSet<Integer> bst = new TreeSet<>();
        //It dont allow duplicate and store data in ascending order

        bst.add(89);
        bst.add(8);
        bst.add(9);
        bst.add(899);
        bst.add(809);
        bst.add(59);

        Iterator<Integer> itr = bst.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next());
            if(itr.hasNext()) System.out.print(" < ");
        }

    }
}