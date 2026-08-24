import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Java marks: ");
        int java = sc.nextInt();

        System.out.print("Enter PHP marks: ");
        int php = sc.nextInt();

        System.out.print("Enter Financial Management marks: ");
        int fm = sc.nextInt();

        System.out.print("Enter Entrepreneurship marks: ");
        int entrepreneurship = sc.nextInt();

        int total = java + php + fm + entrepreneurship;

        double percentage = total / 4.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F - Fail");
        }

        sc.close();
    }
}