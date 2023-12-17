import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        // This program is to check given number is positive or negative
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check Negative or Positive :");
        int a = sc.nextInt();
        if(a==0)
        {
            System.out.println("The given number is neither positive or negative");
        }
        else if(a<0)
        {
            System.out.println("The given number is Negative");
        }
        else
        {
            System.out.println("The given number is positive");
        }
    }
}
