import java.util.Scanner;
class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num =sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Given number is Even : " + num);
        else
            System.out.println("Given number is Odd :  " + num);
    }
}