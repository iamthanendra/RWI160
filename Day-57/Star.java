import java.util.Scanner;
class Star
{
    static void star1(int n)
    {
        for(int i = 0; i < 2*n - 1; i++)
        {
            for(int j = 0; j < 2*n - 1; j++)
            {
                   //upper left  || upper right || lower left || lower right 
                if(j == n - i - 1 || j == (n - 1) + i || i - j == n-1 || j+i == n*3-3)
                {
                System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void star2(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if((i+j-1) % 2 == 0)
                {
                    System.out.print("-");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Star Size : ");
        int n = sc.nextInt();
        star1(n);
        System.out.println("\n---------------------------------------\n");
        star2(n);
    }
}