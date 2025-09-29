import java.util.Scanner;
public class Prime_checker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int count = 0;
        for(int i=2;i<num;i++)
        {
            if(num % i == 0)
            {
                count+=1;
            }
        }
        if(count == 0)
        {
            System.out.print("The number is Prime");
        }
        else
        {
            System.out.print("The number is not prime");
        }
    }
}
