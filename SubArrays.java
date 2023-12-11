
import java.io.*;
import java.util.*;

public class SubArrays 
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

              System.out.print("\t [ \t");
              for(int i=0; i<Array.length; i++)
              {
                     System.out.print(Array[i] + "\t");

              }
              System.out.print(" ]");
              System.out.println();
              System.out.println();

              subA(Array);
       }

       public static void subA(int Array[])
       {
              int start = 0;
              int end = Array.length-1;

              while(start <= end)
              {
                     System.out.print("\t [ \t");
                     for(int i=start; i<Array.length; i++)
                     {
                            System.out.print(Array[i] + "\t");
                     }
                     System.out.print(" ]");
                     System.out.println();
                     start++;
              }
       }
}

