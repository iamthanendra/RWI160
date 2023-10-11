import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class StringAssignment4
{
    public static void main(String[] args) {
        Set<String> allsubstring = new HashSet<>();
        String string_collection = "Thanendra";
        
        int size = string_collection.length();
        for(int i = 0; i < size; i++ )
        {
            for(int j = i + 1; j <= size; j++)
            {
                allsubstring.add(string_collection.substring(i, j));
            }
        }
        
        Iterator<String> itr = allsubstring.iterator();
        
        System.out.print("All Substrings are :\n");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
