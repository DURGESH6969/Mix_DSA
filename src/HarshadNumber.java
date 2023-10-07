
import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        if (n % sum == 0) {
            System.out.println(n + " is a niven or Harshad number");
        } else {
            System.out.println("Not a Harshad or niven number");
        }
    }
}
