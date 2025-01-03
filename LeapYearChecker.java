import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("You have entered a Leap Year ♈");
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("You have entered a Leap Year ♈");
        }
        else {
            System.out.println("You have entered a Non Leap Year ♓");
        }
    }
}
