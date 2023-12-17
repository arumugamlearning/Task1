import java.util.Scanner;

public class Question3
{
    public static void main(String[] args) {
        //This is reverse given number
        Scanner sc = new Scanner(System.in);
        int num = 125;
        int new_num;
        String strNum = Integer.toString(num);
        String newnumber="";
        int length =strNum.length();

        for (int i = strNum.length() - 1; i >= 0; i--)
        {
            newnumber =newnumber + strNum.charAt(i);
        }
        System.out.println(newnumber);
    }
}
