import java.util.Scanner;

public class Question5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount :");
        int amount =sc.nextInt();
        double discount = 0;
        if(amount<500)
        {
            System.out.println("The final pay for the given amount is(No Discount) : "+amount);
        }
        else if (amount>500 && amount<1000)
        {
            discount =amount*0.1;
            System.out.println("The final pay for the given amount is after 10% discount is :"+(amount-discount));

        }
        else
        {
            discount =amount*0.2;
            System.out.println("The final pay for the given amount is after 20% discount is :"+(amount-discount));
        }
    }
}
