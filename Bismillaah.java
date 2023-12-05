import java.io.*;
import java.util.*;

public class Bismillaah
{
    
    public static int userInput(String begin, int uIn)
    {
        int len = begin.length();
        String temp = "";

        for(int i=0; i<uIn; i++)
        {
            temp = temp + begin.charAt(i);
        }        
            System.out.println(temp);

        return temp.length();
    }

    public static void main(String args[])
    {
        System.out.println("Bismillaahir_Rahmaanir_Raheem_");
        String str = "Bismillaahir_Rahmaanir_Raheem_";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number, between 0 to 30");
        int uIn = scanner.nextInt();


        int UIN = userInput(str, uIn);
        System.out.println(UIN);


        /*

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
        

        byte b1 = 10;
        short s1 = 20;
        char c1 = 'c';
        int i1 = 100;

        i1= i1 + s1 + b1 + c1;
        System.out.println(i1);

        */



       
    }
}