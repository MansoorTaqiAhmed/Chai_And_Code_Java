import java.io.*;
import java.util.*;

public class Prime
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int Num = scanner.nextInt();

        boolean Res = isPrime(Num);
        if(Res == true)
                System.out.println("Prime Number");
        else    System.out.println("Complex Number");
    }

    public static boolean isPrime(int N1)
    {
        if(N1 == 1 || N1 == 2)
        {
            return true;
        }
        else
        {
            for(int i=(int)Math.sqrt(N1)+1; i>1; i--)
            {
                System.out.println(i);
                if(N1%i == 0)
                return false;         
            }
            return true;
        }
        
    }
}
