import java.util.Scanner;

 class EvenOddSum
 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // initialize counters
        int countEven = 0;
        int countOdd = 0;
        int sumEven = 0;
        int sumOdd = 0;
        //System.out.println("Enter the no ")

        // loop through 50 numbers
        for (int i = 1; i <= 10; i++) {
            // get number from user
            System.out.print("Enter number #" + i + ": ");
            int num = input.nextInt();

            // check if even or odd
            if (num % 2 == 0) {
                countEven++;
                sumEven += num;
            } else {
                countOdd++;
                sumOdd += num;
            }
        }

        // display results
        System.out.println("Total even numbers: " + countEven);
        System.out.println("Total odd numbers: " + countOdd);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

        input.close();
    }
}