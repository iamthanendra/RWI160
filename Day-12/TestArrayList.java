package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class TestArrayList
{
    public static void main(String[] args)
    {
        List list = new ArrayList<>(); //Type-Unsafe

        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Hello");

        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);//Autobox
        list1.add(Integer.valueOf(20)); //Boxing Manually to Wrapper Class
        list1.add(30);

        System.out.println(list1);

        list1.add(1,-5); //adding new element on index 1 => [10, 20, 30] to [10, -5, 20, 30]
        System.out.println(list1);

        list1.set(1,-10); //adding new element on index 1 => [10, -5, 20, 30] to [10, -10, 20, 30]
        System.out.println(list1);

        System.out.println(list1.get(0));//10

        System.out.println(list1.contains(20)); //searching

        list1.remove(2); //[10, -10, 20, 30] => [10, -10, 30]
        System.out.println(list1);

        //Traversing
        for(int i = 0; i < list1.size(); i++)
        {
            System.out.print(list1.get(i)+" ");
        }

        for(Integer i: list1)
        {
            System.out.println(i+" ");
        }

        //Lambda
        // list1.forEach(e=>{
        //     System.out.println(e);
        // });

        Iterator<Integer> itr1 = list1.iterator(); //One Way
        while(itr1.hasNext())
        {
            System.out.print(itr1.next()+" ");
        }
        System.out.println();

        ListIterator<Integer> itr2 = list1.listIterator(); //Two Way
        while(itr2.hasNext())
        {
            System.out.print(itr2.next()+" ");
        }
        System.out.println();

        Iterator<Integer> itr3 = list1.listIterator(); //Two Way
        while(itr3.hasNext())
        {
            System.out.print(itr3.next()+" ");
        }
        System.out.println();

        
        ListIterator<Integer> itr4 = list1.listIterator(list1.size()); //Setting Cursor at last
        while(itr4.hasPrevious())
        {
            System.out.print(itr4.previous()+" ");
        }
    }
}