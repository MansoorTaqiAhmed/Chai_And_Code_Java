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
              System.out.println("Enter an Index : ");
              int ch1 = scanner.nextInt();
              System.out.println("Character at index: " +SB1.charAt(ch1));




       }
}