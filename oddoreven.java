import java.util.Scanner;
public class oddoreven
{
    public static void main (String [] args)
    {
        Scanner s1= new Scanner(System.in);
        System.out.print("Number: ");
        int a= s1.nextInt();
        System.out.println("Number is: "+a);
        if(a%2==0)
        {
            System.out.println("The number " +a+ " is even");
        }
        else
        {
            System.out.println("The number " +a+ " is odd");
        }
    }
}
