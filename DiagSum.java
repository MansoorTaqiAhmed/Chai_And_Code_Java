import java.io.*;
import java.util.*;

public class DiagSum
{
       public static void main(String args[])
       {
              Scanner scanner = new Scanner(System.in);

              System.out.println("Enter the array size: ");
              int arrSize = scanner.nextInt();
              System.out.println();
              System.out.println(dSum(arrSize));
       }

       public static int dSum(int arrSize)
       {
              int Arr[][] = new int[arrSize][arrSize];
              int sum = 0;

              for(int i=0; i<arrSize; i++)
              {
                     for(int j=0; j<arrSize; j++)
                     {
                            Arr[i][j] = (int) (70.5 * Math.random());
                            System.out.print(Arr[i][j] + "\t");
                            if(i==j)
                                   sum = sum + Arr[i][j];
                     }
                     System.out.println();
              }
              System.out.println();
              return sum;      
       }
}