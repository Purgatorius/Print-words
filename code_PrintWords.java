import java.util.Scanner;

/**
 * Created by B4RT on 2017-06-07.
 */
public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something and I'll print it");
        String text = scanner.next();
        System.out.println("How many times would you like me to print it?");
        int number = scanner.nextInt();
        int print = 0;
        boolean b = true;
        System.out.println("Print that text?");
        System.out.println("1-YES   2-NO");
        while(b)
        {
            print = scanner.nextInt();
            if(print==1||print==2)
                b = false;
            else
                System.out.println("I do not understand. Do you want me to print this text?");
                System.out.println("1-YES   2- NO");
        }

        if(print==1)
            for(int i = 0; i<number; i++)
                System.out.println(text);
    }

}
