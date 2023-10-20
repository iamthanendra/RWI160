package collection;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

class TestQueue
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>(); //Queue is Interface
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);


        Iterator itr = queue.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("Next Removing Element : "+queue.peek());
        System.out.println("Element is Removed : "+queue.poll());
        System.out.println(queue);

        queue.add(50);//can throws exception
        queue.remove();// can throws exception

        System.out.println(queue);
        
    }
}