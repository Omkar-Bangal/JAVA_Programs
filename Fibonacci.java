import java.util.Scanner;
class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num1 , num2 , current_num = 0 , n, i ;
        num1 = 0;
        num2 = 1;
        System.out.print("Enter the number terms : ");
        n =scanner.nextInt();

        i = 1;
        while(i <= n)
        {
            current_num = num1 + num2;
            num1 = num2;
            num2 = current_num;
            i++ ;
            System.out.println(num2);
        }
    }
}