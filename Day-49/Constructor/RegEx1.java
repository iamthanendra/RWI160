import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
//			System.out.println(new MyRegex().pattern);
            System.out.println(""+IP.matches(new MyRegex().pattern));
        }

    }
}
//Write your code here
class MyRegex
{
    //String pattern = "[012]{1}\\d[0-55]{2}\\.{1}\\d[0-55]{2}\\.{1}\\d[0-55]{2}\\.{1}\\d[0-55]{2}";
    String pattern = "[0-2]?[0-55]\\.{1}[0-2]?[0-55]\\.{1}[0-2]?[0-55]\\.{1}[0-2]?[0-55]";
    //String pattern = "\\d[0-255]{1,3}\\.{1}\\d[0-255]{1,3}\\.{1}\\d[0-255]{1,3}\\.{1}\\d[0-255]{1,3}";
}