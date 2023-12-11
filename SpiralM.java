import java.io.*;
import java.util.*;

public class SpiralM 
{
       public static void main(String args[])
       {
              Scanner scanner = new Scanner(System.in);

              System.out.println("Enter the 2D Array Size");
              int SizeX = scanner.nextInt();
              int SizeY = scanner.nextInt();

              int Array[][] = new int[SizeX][SizeY];
              for(int i=0; i<SizeX; i++)
              {
                     for(int j=0; j<SizeY; j++)
                     {
                            Array[i][j] = (int) (70.5 * Math.random());
                     }
                     System.out.println();
              }

              //System.out.print("\t [ \t");
              for(int i=0; i<SizeX; i++)
              {
                     for(int j=0; j<SizeY; j++)
                     {
                            System.out.print(Array[i][j] + "\t");

                     }
                     System.out.println();
              }
              //System.out.print(" ]");
              System.out.println();
              System.out.println();

              spiralMatrix(Array);
       }

       public static void spiralMatrix(int Array[][])
       {
              int start = 0;
              int end = Array.length;
              
              while(start != end)
              {
                      
                     for(int i=start; i<Array[0].length; i++)
                     {
                            System.out.print(Array[start][i] + "\t");
                     }
                     System.out.println();

                     for(int i=start; i<end; i++)
                     {
                           System.out.print(Array[i][(Array[start].length)-1] + "\t");
                     }
                     System.out.println();

                     start++;
                     end--;
              }
              

             
       }
}
