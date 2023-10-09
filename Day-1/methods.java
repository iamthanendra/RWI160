import java.util.Scanner;
import java.io.IOException;
class ArithMeticOperators
{
    //Static Method
    static int add(int x, int y){
        return x + y;
    }
    //Instance Method
    int sub(int x, int y)
    {
        return x - y;
    }
}

class HelloWorld {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        
        System.out.println("a + b = "+ ArithMeticOperators.add(a,b)); 
        System.out.println("a - b = "+ new ArithMeticOperators().sub(a,b));
    }
}