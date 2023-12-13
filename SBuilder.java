import java.io.*;
import java.util.*;

public class SBuilder
{
       public static void main(String[] args) 
       {
              Scanner scanner = new Scanner(System.in);
              
              StringBuilder SB1 = new StringBuilder("New Delhi");
              System.out.println("String: " +SB1);
              System.out.println("Length: " +SB1.length());
              System.out.println("Class : " +SB1.getClass());
              System.out.println("Enter an Index : ");
              int ix1 = scanner.nextInt();
              System.out.println("Character at Index: " +SB1.charAt(ix1));
              System.out.println("Enter a Character : ");
              String ch1 = scanner.next();
              char ch2 = (char)ch1.charAt(0);
              System.out.println("Index at Character: " +SB1.indexOf(ch1));
              SB1.setCharAt(ix1, ch2);
              System.out.println("Updated : " +SB1);
              String S1 = "Happy";
              String S2 = new String("Happy");
              System.out.println("Class : " +S1.getClass());
              System.out.println("Class : " +S2.getClass());
              System.out.println("Compare: "+S1.equals(S2));







       }
}