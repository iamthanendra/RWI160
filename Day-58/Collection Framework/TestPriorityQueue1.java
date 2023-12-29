import java.util.PriorityQueue;
import java.util.Queue;
import java.util.*;

class Book implements Comparable<Book>
{
    public int quantity;
    public String bookName;
    public Book(){}

    public Book(int quantity, String bookName)
    {
        this.quantity = quantity;
        this.bookName = bookName;
    }
    // @Override
    public int compareTo(Book that)
    {
        return this.quantity - that.quantity;
    }
}
class TestPriorityQueue1
{
    public static void main(String[] args)
    {
        Queue<Book> min_pqueue = new PriorityQueue<>();
        min_pqueue.add(new Book(10, "Harry Potter"));
        min_pqueue.add(new Book(5, "Rasengan"));
        min_pqueue.add(new Book(100, "Naruto Mange"));

        for (Book book : min_pqueue)
        {
            System.out.println(book.bookName+" are total : "+book.quantity);
        }
    }
}