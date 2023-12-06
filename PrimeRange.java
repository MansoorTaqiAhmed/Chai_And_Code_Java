import java.io.*;
import java.util.*;

public class PrimeRange
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Range of Number: ");
        int Num1 = scanner.nextInt();
        int Num2 = scanner.nextInt();

        while(Num1 >= Num2)
        {
            boolean Res = isPrime(Num1);
            if(Res == true)     System.out.println(Num1);
            Num1--;
        }

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
                    //  System.out.println(i);
                    if(N1%i == 0)
                    return false;         
                }
                return true;
            }
        }
    
}
