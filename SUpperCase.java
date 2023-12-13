import java.io.*;
import java.util.*;

public class SUpperCase
{
       public static void main(String args[])
       {
              Scanner scanner = new Scanner(System.in);
              System.out.println("Enter a sentence: ");
              String sentence = scanner.nextLine();
              upperCase(sentence);
       }

       public static void upperCase(String sentence)
       {
              StringBuffer newSent = new StringBuffer("");

              for(int i=0; i<sentence.length(); i++)
              {
                     if(sentence.charAt(i) == ' ' && sentence.indexOf(sentence.charAt(i)) < sentence.length()-1)
                     {
                            newSent.append(sentence.charAt(i));
                            i++;
                            newSent.append(Character.toUpperCase(sentence.charAt(i)));
                     }
                     else   newSent.append(Character.toLowerCase(sentence.charAt(i)));
              }
              System.out.println(newSent);
       }
}