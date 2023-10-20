package collection;

import java.util.Deque;
import java.util.ArrayDeque;

class TestArrayDeque
{
    public static void main(String[] args)
    {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(10);
        deque.offerFirst(20);
        deque.offerLast(30);

        deque.forEach((e)->{
            System.out.print(e+" ");
        });
        System.out.println();

        System.out.println(deque.poll());
        deque.forEach((e)->{
            System.out.print(e+" ");
        });
        System.out.println();

        System.out.println(deque.pollLast());
        deque.forEach((e)->{
            System.out.print(e+" ");
        });
        System.out.println();
        
        
        System.out.println(deque.pollFirst());
        deque.forEach((e)->{
            System.out.print(e+" ");
        });
        System.out.println();

    }
}