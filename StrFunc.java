import java.io.*;
import java.util.*;

public class StrFunc
{
       public static void StrRev(String SIn)
       {
              System.out.println(SIn);
              System.out.println(SIn.length()+ " ***");

              int Start = 0;
              int End = SIn.length();
              String Rev = "";
              for(int i=0; i>End; i++)
              {
                     Rev = Rev+SIn.charAt(i);
                     System.out.println(Rev);
              }
              System.out.println(Rev);
       }

       public static void main(String args[])
       {
              Scanner scanner = new Scanner(System.in);
              System.out.println("Enter a String: ");
              String input = scanner.nextLine();
              System.out.println();
              StrHalf(input);
              String SNew = input.substring(0, 6);
              System.out.println(SNew);
              System.out.println();
                                                 //     StrRev(input);
       }

       public static void StrHalf(String SIn)
       {
              System.out.println(SIn);
              System.out.println(SIn.length() +"\n");

              String SNew1 = "";
              String SNew2 = "";
              
              for(int i=0; i<SIn.length(); i++)
              {
                     if(i<SIn.length()/2)
                     {
                            SNew1 = SNew1 + SIn.charAt(i);
                     }
                     else   
                     {
                            SNew2 = SNew2 + SIn.charAt(i);
                     }
              }
              System.out.println(SNew1);
              System.out.println(SNew2);
              System.out.println("Cocatination of String1 & String2 are:   " + SNew1.concat(SNew2));
              System.out.println("Comparision of String1 & String2 are:  " + SNew1.compareTo(SNew2));
       }
}