import java.util.PriorityQueue;
import java.util.Iterator;

class Employee implements Comparable<Employee> {
    int id;
    String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Employee that) {
        return this.id - that.id;
    }
}

public class TestPriorityQueue2 {
    public static void main(String[] args) {
        PriorityQueue<Employee> p_queue = new PriorityQueue<>();
        p_queue.add(new Employee(10, "Thanendra"));
        p_queue.add(new Employee(8, "ThanendraK"));
        p_queue.add(new Employee(12, "ThanendraM"));

        // Corrected iteration using Iterator
        Iterator<Employee> itr = p_queue.iterator();
        while (itr.hasNext()) {
            Employee emp = itr.next();
            System.out.println(emp.id + " -> " + emp.name);
        }

        // Alternatively, you can use a for-each loop to iterate through the PriorityQueue.
        // This is a more concise way to achieve the same result.
        for (Employee emp : p_queue) {
            System.out.println(emp.id + " -> " + emp.name);
        }
    }
}
