import java.io.*;
import java.util.*;

public class Pairs
{
       public static void main(String args[])
       {
              Scanner scanner = new Scanner(System.in);

              System.out.println("Enter the Array Size");
              int Size = scanner.nextInt();

              int Array[] = new int[Size];
              for(int i=0; i<Size; i++)
              {
                     Array[i] = (int) (70.5 * Math.random());
              }

              for(int i=0; i<Array.length; i++)
              {
                     System.out.print(Array[i] + "\t");
              }
              System.out.println();

              pairN(Array);
       }

       public static void pairN(int Array[])
       {
              int start = 0;
              int end = Array.length-1;

              while(start <= end)
              {
                     for(int i=start; i<Array.length; i++)
                     {
                            System.out.print("(" + Array[start] + "," + Array[i] +")" + "\t");
                     }
                     System.out.println();
                     start++;
              }
       }
}