class Sum_of_digits {
    public static void main(String[] args) {
        int num , sum = 0;
        num = 12345;
        while(num!=0)
        {
            sum = sum + num%10;
            num = num / 10;
        }
        System.out.println("Addition of digits is = " + sum);

    }

}
