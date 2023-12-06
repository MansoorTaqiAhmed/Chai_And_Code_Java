import java.io.*;
import java.util.*;

public class Numbers
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int Num = scanner.nextInt();
        Numbers(Num);

    }

    public static void Numbers(int N1)
    {

            for(int i=N1-1; i>1; i--)
            {
                //System.out.println(i);    
                if(N1%i == 0)
                {
                    System.out.println("Complex: " + i);
                }
            }
        
        
    }
}
