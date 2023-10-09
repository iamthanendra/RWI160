import java.util.Scanner;

class Quaditic {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ax^2 + Bx + C = 0");
        
        do{
        System.out.print("Enter A value (A value Can't be Zero ) : ");
        a = sc.nextDouble();
        }while(a == 0);
        System.out.print("Enter B value : ");
        b = sc.nextDouble();
        System.out.print("Enter C value : ");
        c = sc.nextDouble();
        
        //Checking Root are Real or Not
        double D  = Math.pow(b, 2) - (4 * a * c);
        if ( D >= 0 )
        {
            System.out.println("Roots are Real and Distinct");
            double x1 = (-b + Math.sqrt(D))/(2 * a);
            double x2 = (-b - Math.sqrt(D))/(2 * a);
            System.out.print("Value of X are "+x1+" , "+x2);
        }
        else
        {
            System.out.println("Roots are Imaginary");
        
            String x11 = "( "+(-b)+ " + ("+ D +")^1/2 ) / "+2*a;
            String x21 = "( "+(-b)+ " - ("+ D +")^1/2 ) / "+2*a;
            String x12 = "( "+(-b)+ " + ("+ Math.sqrt(-D) +")i ) / "+2*a;
            
            String x22 = "( "+(-b)+ " - ("+ Math.sqrt(-D) +")i ) / "+2*a;
            
            System.out.println("Values of X are : ");
            System.out.println("x : "+x11);
            System.out.println("x : "+x21);
            
            System.out.println("Values of X are : ");
            System.out.println("x : "+x12);
            System.out.println("x : "+x22);
        }
        
    }
}