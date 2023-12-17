import java.util.Scanner;
//This program is the find the smallest of three numbers
public class Question4
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 1st Number :");
        int number1 = sc.nextInt();
        System.out.println("Enter the second Number :");
        int number2 = sc.nextInt();
        System.out.println("Enter the third Number :");
        int number3 = sc.nextInt();

        if(number1 < number2 && number1 < number3)
        {
            System.out.println(number1+ " This is the Smallest number among three");
        }
        else if (number2 < number1 && number2 < number3)
        {
            System.out.println(number2+" This is the Smallest number among three");
        }
        else
        {
            System.out.println(number3 + " This is the Smallest number among three");
        }
    }
}
