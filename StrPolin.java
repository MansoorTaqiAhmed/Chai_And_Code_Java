import java.io.*;
import java.util.*;

public class StrPolin
{
       public static void main(String args[])
       {
              Scanner scanner = new Scanner(System.in);

              System.out.println("Enter a String: ");
              String Str = scanner.nextLine();

              Spacing(Str);
              boolean Res = true;
              Res = Polin(Str);
              if(Res == true)
                     System.out.println("Polindrom String");
              else
                     System.out.println("Non Polindrom String");
       }

       public static void Spacing(String Str)
       {
              for(int i=0; i<Str.length(); i++)
              {
                     System.out.print(Str.charAt(i) + " ");
              }
              System.out.println();
       }

       public static boolean Polin(String Str)
       {
              int start = 0;
              int end = Str.length()-1;
              while(start < end)
              {
                     if(Str.charAt(start) != Str.charAt(end))
                            return false;
                     start++;
                     end--;
              }
              System.out.println(Str);
              return true;
       }
}