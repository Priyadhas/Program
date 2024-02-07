import java.util.Scanner;
public class armstrong
{
    public static void main(String[] args)
    {
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= s1.nextInt();
        int sum= 0;
        int temp= n;
        int r;
        while (n>0)
        {
            r= n%10;
            sum= sum+r*r*r;
            n= n/10;
        }
        if(temp==sum)
        {
            System.out.print("The given number is Armstrong");
        }
        else
        {
            System.out.println("The given number is not armstrong");
        }
    }
}
