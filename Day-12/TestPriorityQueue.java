package collection;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Comparator;

class TestPriorityQueue
{
    public static void main(String[] args)
    {
        Queue<Integer> min_pqueue = new PriorityQueue<>(); //By default Min Heap
        min_pqueue.add(120);
        min_pqueue.add(20);
        min_pqueue.add(67);
        min_pqueue.add(232);
        min_pqueue.add(56);

        Iterator itr = min_pqueue.iterator();

        while(itr.hasNext())
        {
            System.out.print(itr.next()+"->");
        }

        Queue<Integer> max_pqueue = new PriorityQueue<>(Comparator.reverseOrder());
        max_pqueue.add(120);
        max_pqueue.add(20);
        max_pqueue.add(67);
        max_pqueue.add(232);
        max_pqueue.add(56);

        itr = max_pqueue.iterator();

        System.out.println();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+"->");
        }

    }
}