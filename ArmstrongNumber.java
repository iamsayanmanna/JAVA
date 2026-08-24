import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int count = 0;
        int sum = 0;

        int temp = n;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        while (n != 0) {

            int digit = n % 10;

            sum = sum + (int) Math.pow(digit, count);

            n = n / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        sc.close();
    }
}