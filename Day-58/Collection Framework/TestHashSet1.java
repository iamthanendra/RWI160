import java.util.HashSet;

class TestHashSet1
{
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();
        //HashSet dont allow duplicates elements but ordered will not be maintained
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(20);
        set.add(10);
        
        for(Integer itr: set)
        {
            System.out.println(itr);
        }
        
    }
}