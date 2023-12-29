import java.util.Scanner;
class Plaindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");
        int n = sc.nextInt();

        int reverseNumber = 0;
        int temp = n;
        for(; temp > 0; temp /= 10)
        {
            int remainder = temp%10;

            reverseNumber =reverseNumber* 10 + remainder;
        }
        if(reverseNumber == n)
        {
            System.out.print("Palindrome no");
        }
        System.out.print(reverseNumber+" "+n);
    }
}