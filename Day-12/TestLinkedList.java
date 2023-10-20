package collection;
import java.util.LinkedList;
import java.util.List;

class TestLinkedList
{
    public static void main(String[] args)
    {
        List<Integer> list = new LinkedList<>(); //Uses Doubly LinkedList
        // LinkedList<Integer> list = new LinkedList<>(); //Uses Doubly LinkedList

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list); //[10, 20, 30]

        list.remove(0);
        System.out.println(list); //[20, 30]

        list.add(1, 10); //[20, 10, 30]
        System.out.println(list);

        list.set(1, 100);
        System.out.println(list); //[20, 100, 30]

        System.out.println(list.isEmpty());

        System.out.println(list.size());

        list.clear();

        System.out.println(list.isEmpty());

        System.out.println(list.size());


        }
}