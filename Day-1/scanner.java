import java.util.LinkedList;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Employee
{
    int empid;
    String Name;
    Employee(int empid, String Name)
    {
        this.empid = empid;
        this.Name = Name;
    }
}

class Test {
    public static void main(String[] args) throws IOException
    {
        LinkedList<Employee> emplist = new LinkedList<Employee>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        /*
        emplist.add(new Employee(1, "Thanendra Kashyap"));
        emplist.add(new Employee(2, "Satvik"));
        emplist.add(new Employee(3, "Priyal"));
        emplist.add(new Employee(4, "Ankana"));*/
        
        System.out.println("Enter 4 employee Detailes : ");
        for(int i = 1; i<=4; i++){
            System.out.print("Enter Id : ");
            int id = Integer.parseInt(read.readLine());
            System.out.print("Enter Name : ");
            String name = read.readLine();
            
            emplist.add(new Employee(id, name));
            
        }
        
        Iterator<Employee> itr = emplist.iterator();
        
        while(itr.hasNext())
        {
            Employee emp = itr.next();
            System.out.println("Employee Details");
            System.out.println("------------------------");
            System.out.println("Emp Id : "+emp.empid);
            System.out.println("Emp Name : "+emp.Name);
        }
    }
}